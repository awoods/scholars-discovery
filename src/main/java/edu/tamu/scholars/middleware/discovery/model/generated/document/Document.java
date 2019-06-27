package edu.tamu.scholars.middleware.discovery.model.generated.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;
import java.util.List;

public class Document extends AbstractNestedDocument {
  private static final long serialVersionUID = -6290549169248047714L;

  private List<Website> websites;

  private PublicationVenue publicationVenue;

  private PublicationVenueFor publicationVenueFor;

  private List<EtdChairedBy> etdChairedBy;

  private List<EtdChairedByOrganization> etdChairedByOrganization;

  private List<Author> authors;

  private List<AuthorOrganization> authorOrganization;

  private List<Editor> editors;

  private List<Translator> translators;

  private Publisher publisher;

  private List<SubjectArea> subjectAreas;

  private List<DocumentPart> documentParts;

  private List<Feature> features;

  private List<GeographicFocus> geographicFocus;

  private List<DocumentationForProjectOrResource> documentationForProjectOrResource;

  private List<OutputOfProcessOrEvent> outputOfProcessOrEvent;

  private List<PresentedAt> presentedAt;

  private List<CitedBy> citedBy;

  private List<Citation> citations;

  private List<CitesAsDataSource> citesAsDataSource;

  private List<Translation> translations;

  private List<TranslationOf> translationOf;

  private List<GlobalCitationFrequency> globalCitationFrequency;

  private List<Assignee> assignees;

  private List<ReproducedIn> reproducedIn;

  private List<Reproduce> reproduces;

  private List<IsAbout> isAbout;

  private List<SpecifiedOutputOf> specifiedOutputOf;

  private List<Mention> mentions;

  private List<ParticipatesIn> participatesIn;

  private List<SupportedBy> supportedBy;

  private List<Receipt> receipts;

  private List<SameAs> sameAs;

  private String title;

  private List<String> type;

  private String image;

  private String thumbnail;

  @JsonProperty("abstract")
  private String abstractText;

  private String abbreviation;

  private List<String> authorList;

  private List<String> editorList;

  private String bookTitle;

  private String status;

  private String publicationDate;

  private String dateFiled;

  private String dateIssued;

  private List<String> restrictions;

  private String chapter;

  private String edition;

  private List<String> keywords;

  private String eanucc13;

  private String nihmsid;

  private String pmcid;

  private String identifier;

  private String patentNumber;

  private String doi;

  private String oclcnum;

  private String isbn10;

  private String isbn13;

  private String pmid;

  private String lccn;

  private String issn;

  private String eissn;

  private String uri;

  private String iclCode;

  private String numberOfPages;

  private String pageStart;

  private String pageEnd;

  private String volume;

  private String issue;

  private String placeOfPublication;

  private String isTemplate;

  private String modTime;

  public Document() {
    super();
  }

  public List<Website> getWebsites() {
    return websites;
  }

  public void setWebsites(List<Website> websites) {
    this.websites = websites;
  }

  public PublicationVenue getPublicationVenue() {
    return publicationVenue;
  }

  public void setPublicationVenue(PublicationVenue publicationVenue) {
    this.publicationVenue = publicationVenue;
  }

  public PublicationVenueFor getPublicationVenueFor() {
    return publicationVenueFor;
  }

  public void setPublicationVenueFor(PublicationVenueFor publicationVenueFor) {
    this.publicationVenueFor = publicationVenueFor;
  }

  public List<EtdChairedBy> getEtdChairedBy() {
    return etdChairedBy;
  }

  public void setEtdChairedBy(List<EtdChairedBy> etdChairedBy) {
    this.etdChairedBy = etdChairedBy;
  }

  public List<EtdChairedByOrganization> getEtdChairedByOrganization() {
    return etdChairedByOrganization;
  }

  public void setEtdChairedByOrganization(List<EtdChairedByOrganization> etdChairedByOrganization) {
    this.etdChairedByOrganization = etdChairedByOrganization;
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }

  public List<AuthorOrganization> getAuthorOrganization() {
    return authorOrganization;
  }

  public void setAuthorOrganization(List<AuthorOrganization> authorOrganization) {
    this.authorOrganization = authorOrganization;
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

  public List<DocumentPart> getDocumentParts() {
    return documentParts;
  }

  public void setDocumentParts(List<DocumentPart> documentParts) {
    this.documentParts = documentParts;
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

  public List<DocumentationForProjectOrResource> getDocumentationForProjectOrResource() {
    return documentationForProjectOrResource;
  }

  public void setDocumentationForProjectOrResource(
      List<DocumentationForProjectOrResource> documentationForProjectOrResource) {
    this.documentationForProjectOrResource = documentationForProjectOrResource;
  }

  public List<OutputOfProcessOrEvent> getOutputOfProcessOrEvent() {
    return outputOfProcessOrEvent;
  }

  public void setOutputOfProcessOrEvent(List<OutputOfProcessOrEvent> outputOfProcessOrEvent) {
    this.outputOfProcessOrEvent = outputOfProcessOrEvent;
  }

  public List<PresentedAt> getPresentedAt() {
    return presentedAt;
  }

  public void setPresentedAt(List<PresentedAt> presentedAt) {
    this.presentedAt = presentedAt;
  }

  public List<CitedBy> getCitedBy() {
    return citedBy;
  }

  public void setCitedBy(List<CitedBy> citedBy) {
    this.citedBy = citedBy;
  }

  public List<Citation> getCitations() {
    return citations;
  }

  public void setCitations(List<Citation> citations) {
    this.citations = citations;
  }

  public List<CitesAsDataSource> getCitesAsDataSource() {
    return citesAsDataSource;
  }

  public void setCitesAsDataSource(List<CitesAsDataSource> citesAsDataSource) {
    this.citesAsDataSource = citesAsDataSource;
  }

  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  public List<TranslationOf> getTranslationOf() {
    return translationOf;
  }

  public void setTranslationOf(List<TranslationOf> translationOf) {
    this.translationOf = translationOf;
  }

  public List<GlobalCitationFrequency> getGlobalCitationFrequency() {
    return globalCitationFrequency;
  }

  public void setGlobalCitationFrequency(List<GlobalCitationFrequency> globalCitationFrequency) {
    this.globalCitationFrequency = globalCitationFrequency;
  }

  public List<Assignee> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<Assignee> assignees) {
    this.assignees = assignees;
  }

  public List<ReproducedIn> getReproducedIn() {
    return reproducedIn;
  }

  public void setReproducedIn(List<ReproducedIn> reproducedIn) {
    this.reproducedIn = reproducedIn;
  }

  public List<Reproduce> getReproduces() {
    return reproduces;
  }

  public void setReproduces(List<Reproduce> reproduces) {
    this.reproduces = reproduces;
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

  public List<Receipt> getReceipts() {
    return receipts;
  }

  public void setReceipts(List<Receipt> receipts) {
    this.receipts = receipts;
  }

  public List<SameAs> getSameAs() {
    return sameAs;
  }

  public void setSameAs(List<SameAs> sameAs) {
    this.sameAs = sameAs;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public List<String> getAuthorList() {
    return authorList;
  }

  public void setAuthorList(List<String> authorList) {
    this.authorList = authorList;
  }

  public List<String> getEditorList() {
    return editorList;
  }

  public void setEditorList(List<String> editorList) {
    this.editorList = editorList;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  public String getDateFiled() {
    return dateFiled;
  }

  public void setDateFiled(String dateFiled) {
    this.dateFiled = dateFiled;
  }

  public String getDateIssued() {
    return dateIssued;
  }

  public void setDateIssued(String dateIssued) {
    this.dateIssued = dateIssued;
  }

  public List<String> getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(List<String> restrictions) {
    this.restrictions = restrictions;
  }

  public String getChapter() {
    return chapter;
  }

  public void setChapter(String chapter) {
    this.chapter = chapter;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public String getEanucc13() {
    return eanucc13;
  }

  public void setEanucc13(String eanucc13) {
    this.eanucc13 = eanucc13;
  }

  public String getNihmsid() {
    return nihmsid;
  }

  public void setNihmsid(String nihmsid) {
    this.nihmsid = nihmsid;
  }

  public String getPmcid() {
    return pmcid;
  }

  public void setPmcid(String pmcid) {
    this.pmcid = pmcid;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public String getPatentNumber() {
    return patentNumber;
  }

  public void setPatentNumber(String patentNumber) {
    this.patentNumber = patentNumber;
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

  public String getIsbn10() {
    return isbn10;
  }

  public void setIsbn10(String isbn10) {
    this.isbn10 = isbn10;
  }

  public String getIsbn13() {
    return isbn13;
  }

  public void setIsbn13(String isbn13) {
    this.isbn13 = isbn13;
  }

  public String getPmid() {
    return pmid;
  }

  public void setPmid(String pmid) {
    this.pmid = pmid;
  }

  public String getLccn() {
    return lccn;
  }

  public void setLccn(String lccn) {
    this.lccn = lccn;
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

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public String getIclCode() {
    return iclCode;
  }

  public void setIclCode(String iclCode) {
    this.iclCode = iclCode;
  }

  public String getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(String numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public String getPageStart() {
    return pageStart;
  }

  public void setPageStart(String pageStart) {
    this.pageStart = pageStart;
  }

  public String getPageEnd() {
    return pageEnd;
  }

  public void setPageEnd(String pageEnd) {
    this.pageEnd = pageEnd;
  }

  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public String getIssue() {
    return issue;
  }

  public void setIssue(String issue) {
    this.issue = issue;
  }

  public String getPlaceOfPublication() {
    return placeOfPublication;
  }

  public void setPlaceOfPublication(String placeOfPublication) {
    this.placeOfPublication = placeOfPublication;
  }

  public String getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(String isTemplate) {
    this.isTemplate = isTemplate;
  }

  public String getModTime() {
    return modTime;
  }

  public void setModTime(String modTime) {
    this.modTime = modTime;
  }
}
