package edu.tamu.scholars.middleware.discovery.model.generated.person;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class PerformsTechnique extends AbstractNestedDocument {
  private static final long serialVersionUID = -1543588701L;

  private String type;

  public PerformsTechnique() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
