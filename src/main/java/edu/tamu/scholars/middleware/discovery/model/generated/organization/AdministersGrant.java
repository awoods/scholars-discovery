package edu.tamu.scholars.middleware.discovery.model.generated.organization;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class AdministersGrant extends AbstractNestedDocument {
  private static final long serialVersionUID = 4487557055329169208L;

  private String date;

  public AdministersGrant() {
    super();
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
