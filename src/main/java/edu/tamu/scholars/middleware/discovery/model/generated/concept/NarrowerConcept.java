package edu.tamu.scholars.middleware.discovery.model.generated.concept;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class NarrowerConcept extends AbstractNestedDocument {
  private static final long serialVersionUID = -4321604532878911975L;

  private String type;

  public NarrowerConcept() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
