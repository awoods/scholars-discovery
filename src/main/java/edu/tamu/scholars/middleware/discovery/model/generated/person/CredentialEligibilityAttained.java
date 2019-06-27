package edu.tamu.scholars.middleware.discovery.model.generated.person;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class CredentialEligibilityAttained extends AbstractNestedDocument {
  private static final long serialVersionUID = -6835079032067944830L;

  private String type;

  public CredentialEligibilityAttained() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
