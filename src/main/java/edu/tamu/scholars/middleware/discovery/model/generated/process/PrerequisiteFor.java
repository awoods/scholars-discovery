package edu.tamu.scholars.middleware.discovery.model.generated.process;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class PrerequisiteFor extends AbstractNestedDocument {
  private static final long serialVersionUID = -1150470410L;

  private String type;

  public PrerequisiteFor() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
