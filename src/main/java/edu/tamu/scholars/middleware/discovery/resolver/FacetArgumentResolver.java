package edu.tamu.scholars.middleware.discovery.resolver;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.MethodParameter;
import org.springframework.core.ResolvableType;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import edu.tamu.scholars.middleware.discovery.argument.Facet;

public class FacetArgumentResolver implements HandlerMethodArgumentResolver {

    private final static String FACET_QUERY_PARAM_KEY = "facets";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        ResolvableType resolvableType = ResolvableType.forMethodParameter(parameter);
        return resolvableType.hasGenerics() && Facet.class.isAssignableFrom(resolvableType.getGeneric(0).resolve());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest();
        return Collections.list(request.getParameterNames()).stream()
            .filter(paramName -> paramName.equals(FACET_QUERY_PARAM_KEY))
            .map(request::getParameterValues)
            .map(Arrays::asList)
            .flatMap(list -> list.stream())
            .map(s -> s.split(","))
            .map(Arrays::asList)
            .flatMap(list -> list.stream())
            .map(Facet::of)
            .collect(Collectors.toList());
    }

}
