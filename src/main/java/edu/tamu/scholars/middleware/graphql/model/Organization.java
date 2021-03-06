package edu.tamu.scholars.middleware.graphql.model;

import edu.tamu.scholars.middleware.graphql.model.organization.Degree;
import edu.tamu.scholars.middleware.graphql.model.organization.SponsorsAwardOrHonor;
import edu.tamu.scholars.middleware.graphql.model.organization.AwardOrHonorGiven;
import edu.tamu.scholars.middleware.graphql.model.organization.AwardOrHonorReceived;
import edu.tamu.scholars.middleware.graphql.model.organization.OrganizationForTraining;
import edu.tamu.scholars.middleware.graphql.model.Person;
import edu.tamu.scholars.middleware.graphql.model.organization.HasSubOrganization;
import edu.tamu.scholars.middleware.graphql.model.organization.OrganizationWithin;
import edu.tamu.scholars.middleware.graphql.model.organization.LeadOrganizationOf;
import edu.tamu.scholars.middleware.graphql.model.organization.HasCollaboratingOrganizationOrGroup;
import edu.tamu.scholars.middleware.graphql.model.organization.HasAffiliatedOrganization;
import edu.tamu.scholars.middleware.graphql.model.organization.MemberOf;
import edu.tamu.scholars.middleware.graphql.model.organization.ClinicalActivity;
import edu.tamu.scholars.middleware.graphql.model.organization.ConvenerOfEvent;
import edu.tamu.scholars.middleware.graphql.model.organization.AttendedEvent;
import edu.tamu.scholars.middleware.graphql.model.organization.Publication;
import edu.tamu.scholars.middleware.graphql.model.organization.PublisherOf;
import edu.tamu.scholars.middleware.graphql.model.organization.Presentation;
import edu.tamu.scholars.middleware.graphql.model.organization.FeaturedIn;
import edu.tamu.scholars.middleware.graphql.model.organization.AssigneeForPatent;
import edu.tamu.scholars.middleware.graphql.model.organization.TranslatorOf;
import edu.tamu.scholars.middleware.graphql.model.organization.AwardsGrant;
import edu.tamu.scholars.middleware.graphql.model.organization.AdministersGrant;
import edu.tamu.scholars.middleware.graphql.model.organization.SubcontractsGrant;
import edu.tamu.scholars.middleware.graphql.model.organization.PerformsHumanStudy;
import edu.tamu.scholars.middleware.graphql.model.organization.ContractOrProviderForService;
import edu.tamu.scholars.middleware.graphql.model.organization.OutreachAndCommunityServiceActivity;
import edu.tamu.scholars.middleware.graphql.model.organization.HasEquipment;
import edu.tamu.scholars.middleware.graphql.model.organization.Course;
import edu.tamu.scholars.middleware.graphql.model.organization.LocatedAtFacility;
import edu.tamu.scholars.middleware.graphql.model.organization.PredecessorOrganization;
import edu.tamu.scholars.middleware.graphql.model.organization.SuccessorOrganization;
import edu.tamu.scholars.middleware.graphql.model.organization.GoverningAuthorityFor;
import edu.tamu.scholars.middleware.graphql.model.organization.AffiliatedResearchArea;
import edu.tamu.scholars.middleware.graphql.model.common.Website;
import edu.tamu.scholars.middleware.graphql.model.common.SameAs;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;
import java.util.List;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "Organization"
)
@JsonInclude(NON_EMPTY)
public class Organization extends AbstractNestedDocument {
  private static final long serialVersionUID = 884563225L;

  private List<Degree> degrees;

  private List<SponsorsAwardOrHonor> sponsorsAwardOrHonor;

  private List<AwardOrHonorGiven> awardOrHonorGiven;

  private List<AwardOrHonorReceived> awardOrHonorReceived;

  private List<OrganizationForTraining> organizationForTraining;

  private List<Person> people;

  private List<HasSubOrganization> hasSubOrganizations;

  private List<OrganizationWithin> organizationWithin;

  private List<LeadOrganizationOf> leadOrganizationOf;

  private List<HasCollaboratingOrganizationOrGroup> hasCollaboratingOrganizationOrGroup;

  private List<HasAffiliatedOrganization> hasAffiliatedOrganizations;

  private List<MemberOf> memberOf;

  private List<ClinicalActivity> clinicalActivities;

  private List<ConvenerOfEvent> convenerOfEvents;

  private List<AttendedEvent> attendedEvents;

  private List<Publication> publications;

  private List<PublisherOf> publisherOf;

  private List<Presentation> presentations;

  private List<FeaturedIn> featuredIn;

  private List<AssigneeForPatent> assigneeForPatent;

  private List<TranslatorOf> translatorOf;

  private List<AwardsGrant> awardsGrant;

  private List<AdministersGrant> administersGrant;

  private List<SubcontractsGrant> subcontractsGrant;

  private List<PerformsHumanStudy> performsHumanStudy;

  private List<ContractOrProviderForService> contractOrProviderForService;

  private List<OutreachAndCommunityServiceActivity> outreachAndCommunityServiceActivities;

  private List<HasEquipment> hasEquipment;

  private List<Course> courses;

  private List<LocatedAtFacility> locatedAtFacilities;

  private List<PredecessorOrganization> predecessorOrganizations;

  private List<SuccessorOrganization> successorOrganizations;

  private List<GoverningAuthorityFor> governingAuthorityFor;

  private List<AffiliatedResearchArea> affiliatedResearchAreas;

  private List<Website> websites;

  private List<SameAs> sameAs;

  private String name;

  private String overview;

  private String abbreviation;

  private String date;

  private List<String> keywords;

  private String orgId;

  private String phone;

  private String fax;

  private String emailAddress;

  private String streetAddress;

  private String locality;

  private String region;

  private String postalCode;

  private String country;

  private String geographicLocation;

  private List<String> type;

  private String image;

  private String thumbnail;

  private String modTime;

  @JsonProperty("class")
  private String clazz;

  public Organization() {
    super();
  }

  public List<Degree> getDegrees() {
    return degrees;
  }

  public void setDegrees(List<Degree> degrees) {
    this.degrees = degrees;
  }

  public List<SponsorsAwardOrHonor> getSponsorsAwardOrHonor() {
    return sponsorsAwardOrHonor;
  }

  public void setSponsorsAwardOrHonor(List<SponsorsAwardOrHonor> sponsorsAwardOrHonor) {
    this.sponsorsAwardOrHonor = sponsorsAwardOrHonor;
  }

  public List<AwardOrHonorGiven> getAwardOrHonorGiven() {
    return awardOrHonorGiven;
  }

  public void setAwardOrHonorGiven(List<AwardOrHonorGiven> awardOrHonorGiven) {
    this.awardOrHonorGiven = awardOrHonorGiven;
  }

  public List<AwardOrHonorReceived> getAwardOrHonorReceived() {
    return awardOrHonorReceived;
  }

  public void setAwardOrHonorReceived(List<AwardOrHonorReceived> awardOrHonorReceived) {
    this.awardOrHonorReceived = awardOrHonorReceived;
  }

  public List<OrganizationForTraining> getOrganizationForTraining() {
    return organizationForTraining;
  }

  public void setOrganizationForTraining(List<OrganizationForTraining> organizationForTraining) {
    this.organizationForTraining = organizationForTraining;
  }

  public List<Person> getPeople() {
    return people;
  }

  public void setPeople(List<Person> people) {
    this.people = people;
  }

  public List<HasSubOrganization> getHasSubOrganizations() {
    return hasSubOrganizations;
  }

  public void setHasSubOrganizations(List<HasSubOrganization> hasSubOrganizations) {
    this.hasSubOrganizations = hasSubOrganizations;
  }

  public List<OrganizationWithin> getOrganizationWithin() {
    return organizationWithin;
  }

  public void setOrganizationWithin(List<OrganizationWithin> organizationWithin) {
    this.organizationWithin = organizationWithin;
  }

  public List<LeadOrganizationOf> getLeadOrganizationOf() {
    return leadOrganizationOf;
  }

  public void setLeadOrganizationOf(List<LeadOrganizationOf> leadOrganizationOf) {
    this.leadOrganizationOf = leadOrganizationOf;
  }

  public List<HasCollaboratingOrganizationOrGroup> getHasCollaboratingOrganizationOrGroup() {
    return hasCollaboratingOrganizationOrGroup;
  }

  public void setHasCollaboratingOrganizationOrGroup(
      List<HasCollaboratingOrganizationOrGroup> hasCollaboratingOrganizationOrGroup) {
    this.hasCollaboratingOrganizationOrGroup = hasCollaboratingOrganizationOrGroup;
  }

  public List<HasAffiliatedOrganization> getHasAffiliatedOrganizations() {
    return hasAffiliatedOrganizations;
  }

  public void setHasAffiliatedOrganizations(
      List<HasAffiliatedOrganization> hasAffiliatedOrganizations) {
    this.hasAffiliatedOrganizations = hasAffiliatedOrganizations;
  }

  public List<MemberOf> getMemberOf() {
    return memberOf;
  }

  public void setMemberOf(List<MemberOf> memberOf) {
    this.memberOf = memberOf;
  }

  public List<ClinicalActivity> getClinicalActivities() {
    return clinicalActivities;
  }

  public void setClinicalActivities(List<ClinicalActivity> clinicalActivities) {
    this.clinicalActivities = clinicalActivities;
  }

  public List<ConvenerOfEvent> getConvenerOfEvents() {
    return convenerOfEvents;
  }

  public void setConvenerOfEvents(List<ConvenerOfEvent> convenerOfEvents) {
    this.convenerOfEvents = convenerOfEvents;
  }

  public List<AttendedEvent> getAttendedEvents() {
    return attendedEvents;
  }

  public void setAttendedEvents(List<AttendedEvent> attendedEvents) {
    this.attendedEvents = attendedEvents;
  }

  public List<Publication> getPublications() {
    return publications;
  }

  public void setPublications(List<Publication> publications) {
    this.publications = publications;
  }

  public List<PublisherOf> getPublisherOf() {
    return publisherOf;
  }

  public void setPublisherOf(List<PublisherOf> publisherOf) {
    this.publisherOf = publisherOf;
  }

  public List<Presentation> getPresentations() {
    return presentations;
  }

  public void setPresentations(List<Presentation> presentations) {
    this.presentations = presentations;
  }

  public List<FeaturedIn> getFeaturedIn() {
    return featuredIn;
  }

  public void setFeaturedIn(List<FeaturedIn> featuredIn) {
    this.featuredIn = featuredIn;
  }

  public List<AssigneeForPatent> getAssigneeForPatent() {
    return assigneeForPatent;
  }

  public void setAssigneeForPatent(List<AssigneeForPatent> assigneeForPatent) {
    this.assigneeForPatent = assigneeForPatent;
  }

  public List<TranslatorOf> getTranslatorOf() {
    return translatorOf;
  }

  public void setTranslatorOf(List<TranslatorOf> translatorOf) {
    this.translatorOf = translatorOf;
  }

  public List<AwardsGrant> getAwardsGrant() {
    return awardsGrant;
  }

  public void setAwardsGrant(List<AwardsGrant> awardsGrant) {
    this.awardsGrant = awardsGrant;
  }

  public List<AdministersGrant> getAdministersGrant() {
    return administersGrant;
  }

  public void setAdministersGrant(List<AdministersGrant> administersGrant) {
    this.administersGrant = administersGrant;
  }

  public List<SubcontractsGrant> getSubcontractsGrant() {
    return subcontractsGrant;
  }

  public void setSubcontractsGrant(List<SubcontractsGrant> subcontractsGrant) {
    this.subcontractsGrant = subcontractsGrant;
  }

  public List<PerformsHumanStudy> getPerformsHumanStudy() {
    return performsHumanStudy;
  }

  public void setPerformsHumanStudy(List<PerformsHumanStudy> performsHumanStudy) {
    this.performsHumanStudy = performsHumanStudy;
  }

  public List<ContractOrProviderForService> getContractOrProviderForService() {
    return contractOrProviderForService;
  }

  public void setContractOrProviderForService(
      List<ContractOrProviderForService> contractOrProviderForService) {
    this.contractOrProviderForService = contractOrProviderForService;
  }

  public List<OutreachAndCommunityServiceActivity> getOutreachAndCommunityServiceActivities() {
    return outreachAndCommunityServiceActivities;
  }

  public void setOutreachAndCommunityServiceActivities(
      List<OutreachAndCommunityServiceActivity> outreachAndCommunityServiceActivities) {
    this.outreachAndCommunityServiceActivities = outreachAndCommunityServiceActivities;
  }

  public List<HasEquipment> getHasEquipment() {
    return hasEquipment;
  }

  public void setHasEquipment(List<HasEquipment> hasEquipment) {
    this.hasEquipment = hasEquipment;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }

  public List<LocatedAtFacility> getLocatedAtFacilities() {
    return locatedAtFacilities;
  }

  public void setLocatedAtFacilities(List<LocatedAtFacility> locatedAtFacilities) {
    this.locatedAtFacilities = locatedAtFacilities;
  }

  public List<PredecessorOrganization> getPredecessorOrganizations() {
    return predecessorOrganizations;
  }

  public void setPredecessorOrganizations(List<PredecessorOrganization> predecessorOrganizations) {
    this.predecessorOrganizations = predecessorOrganizations;
  }

  public List<SuccessorOrganization> getSuccessorOrganizations() {
    return successorOrganizations;
  }

  public void setSuccessorOrganizations(List<SuccessorOrganization> successorOrganizations) {
    this.successorOrganizations = successorOrganizations;
  }

  public List<GoverningAuthorityFor> getGoverningAuthorityFor() {
    return governingAuthorityFor;
  }

  public void setGoverningAuthorityFor(List<GoverningAuthorityFor> governingAuthorityFor) {
    this.governingAuthorityFor = governingAuthorityFor;
  }

  public List<AffiliatedResearchArea> getAffiliatedResearchAreas() {
    return affiliatedResearchAreas;
  }

  public void setAffiliatedResearchAreas(List<AffiliatedResearchArea> affiliatedResearchAreas) {
    this.affiliatedResearchAreas = affiliatedResearchAreas;
  }

  public List<Website> getWebsites() {
    return websites;
  }

  public void setWebsites(List<Website> websites) {
    this.websites = websites;
  }

  public List<SameAs> getSameAs() {
    return sameAs;
  }

  public void setSameAs(List<SameAs> sameAs) {
    this.sameAs = sameAs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getGeographicLocation() {
    return geographicLocation;
  }

  public void setGeographicLocation(String geographicLocation) {
    this.geographicLocation = geographicLocation;
  }

  public List<String> getType() {
    return type;
  }

  public void setType(List<String> type) {
    this.type = type;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public String getModTime() {
    return modTime;
  }

  public void setModTime(String modTime) {
    this.modTime = modTime;
  }

  public String getClazz() {
    return clazz;
  }

  public void setClazz(String clazz) {
    this.clazz = clazz;
  }
}
