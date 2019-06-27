package edu.tamu.scholars.middleware.discovery.model.generated.organization;

import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import java.lang.String;

public class OrganizationForTraining extends AbstractNestedDocument {
  private static final long serialVersionUID = 2793721015241989688L;

  private OrganizationForTrainingTrainee trainee;

  private String startDate;

  private String endDate;

  public OrganizationForTraining() {
    super();
  }

  public OrganizationForTrainingTrainee getTrainee() {
    return trainee;
  }

  public void setTrainee(OrganizationForTrainingTrainee trainee) {
    this.trainee = trainee;
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
