package edu.tamu.scholars.middleware.discovery.model.generated.organization;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
public class PublisherOf extends AbstractNestedDocument {
  private static final long serialVersionUID = -537497994L;

  private String type;

  private String date;

  public PublisherOf() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
