package edu.tamu.scholars.middleware.discovery.model.generated.collection;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;
import java.util.List;

public class Collection extends AbstractNestedDocument {
  private static final long serialVersionUID = 1090817776L;

  private List<Website> websites;

  private List<PublicationVenueFor> publicationVenueFor;

  private List<Author> authors;

  private List<Editor> editors;

  private List<Translator> translators;

  private Publisher publisher;

  private List<SubjectArea> subjectAreas;

  private List<Feature> features;

  private List<GeographicFocus> geographicFocus;

  private List<OutputOfProcessOrEvent> outputOfProcessOrEvent;

  private List<IsAbout> isAbout;

  private List<SpecifiedOutputOf> specifiedOutputOf;

  private List<Mention> mentions;

  private List<ParticipatesIn> participatesIn;

  private List<SupportedBy> supportedBy;

  private List<SameAs> sameAs;

  private String name;

  private List<String> type;

  private String image;

  private String thumbnail;

  @JsonProperty("abstract")
  private String abstractText;

  private String abbreviation;

  private String publicationDate;

  private List<String> keywords;

  private String issn;

  private String eissn;

  private String doi;

  private String oclcnum;

  private String modTime;

  public Collection() {
    super();
  }

  public List<Website> getWebsites() {
    return websites;
  }

  public void setWebsites(List<Website> websites) {
    this.websites = websites;
  }

  public List<PublicationVenueFor> getPublicationVenueFor() {
    return publicationVenueFor;
  }

  public void setPublicationVenueFor(List<PublicationVenueFor> publicationVenueFor) {
    this.publicationVenueFor = publicationVenueFor;
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }

  public List<Editor> getEditors() {
    return editors;
  }

  public void setEditors(List<Editor> editors) {
    this.editors = editors;
  }

  public List<Translator> getTranslators() {
    return translators;
  }

  public void setTranslators(List<Translator> translators) {
    this.translators = translators;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public List<SubjectArea> getSubjectAreas() {
    return subjectAreas;
  }

  public void setSubjectAreas(List<SubjectArea> subjectAreas) {
    this.subjectAreas = subjectAreas;
  }

  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public List<GeographicFocus> getGeographicFocus() {
    return geographicFocus;
  }

  public void setGeographicFocus(List<GeographicFocus> geographicFocus) {
    this.geographicFocus = geographicFocus;
  }

  public List<OutputOfProcessOrEvent> getOutputOfProcessOrEvent() {
    return outputOfProcessOrEvent;
  }

  public void setOutputOfProcessOrEvent(List<OutputOfProcessOrEvent> outputOfProcessOrEvent) {
    this.outputOfProcessOrEvent = outputOfProcessOrEvent;
  }

  public List<IsAbout> getIsAbout() {
    return isAbout;
  }

  public void setIsAbout(List<IsAbout> isAbout) {
    this.isAbout = isAbout;
  }

  public List<SpecifiedOutputOf> getSpecifiedOutputOf() {
    return specifiedOutputOf;
  }

  public void setSpecifiedOutputOf(List<SpecifiedOutputOf> specifiedOutputOf) {
    this.specifiedOutputOf = specifiedOutputOf;
  }

  public List<Mention> getMentions() {
    return mentions;
  }

  public void setMentions(List<Mention> mentions) {
    this.mentions = mentions;
  }

  public List<ParticipatesIn> getParticipatesIn() {
    return participatesIn;
  }

  public void setParticipatesIn(List<ParticipatesIn> participatesIn) {
    this.participatesIn = participatesIn;
  }

  public List<SupportedBy> getSupportedBy() {
    return supportedBy;
  }

  public void setSupportedBy(List<SupportedBy> supportedBy) {
    this.supportedBy = supportedBy;
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

  public String getAbstractText() {
    return abstractText;
  }

  public void setAbstractText(String abstractText) {
    this.abstractText = abstractText;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public String getIssn() {
    return issn;
  }

  public void setIssn(String issn) {
    this.issn = issn;
  }

  public String getEissn() {
    return eissn;
  }

  public void setEissn(String eissn) {
    this.eissn = eissn;
  }

  public String getDoi() {
    return doi;
  }

  public void setDoi(String doi) {
    this.doi = doi;
  }

  public String getOclcnum() {
    return oclcnum;
  }

  public void setOclcnum(String oclcnum) {
    this.oclcnum = oclcnum;
  }

  public String getModTime() {
    return modTime;
  }

  public void setModTime(String modTime) {
    this.modTime = modTime;
  }
}
