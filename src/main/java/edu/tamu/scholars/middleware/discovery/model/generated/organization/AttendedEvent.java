package edu.tamu.scholars.middleware.discovery.model.generated.organization;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class AttendedEvent extends AbstractNestedDocument {
  private static final long serialVersionUID = -1323516380L;

  private String date;

  public AttendedEvent() {
    super();
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
