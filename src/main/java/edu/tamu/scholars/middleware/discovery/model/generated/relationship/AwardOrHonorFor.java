package edu.tamu.scholars.middleware.discovery.model.generated.relationship;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "RelationshipAwardOrHonorFor"
)
@JsonInclude(NON_EMPTY)
public class AwardOrHonorFor extends AbstractNestedDocument {
  private static final long serialVersionUID = 714765383L;

  private String type;

  public AwardOrHonorFor() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
