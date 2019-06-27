package edu.tamu.scholars.middleware.discovery.model.generated.person;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class ClinicalActivity extends AbstractNestedDocument {
  private static final long serialVersionUID = -1300771918070869147L;

  private String type;

  private String role;

  private String startDate;

  private String endDate;

  public ClinicalActivity() {
    super();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
}
