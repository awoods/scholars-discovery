package edu.tamu.scholars.middleware.discovery.model.generated.person;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class Publication extends AbstractNestedDocument {
  private static final long serialVersionUID = 1869462865L;

  private String type;

  private String publisher;

  private SelectedPublicationVenue venue;

  private String date;

  public Publication() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public SelectedPublicationVenue getVenue() {
    return venue;
  }

  public void setVenue(SelectedPublicationVenue venue) {
    this.venue = venue;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
