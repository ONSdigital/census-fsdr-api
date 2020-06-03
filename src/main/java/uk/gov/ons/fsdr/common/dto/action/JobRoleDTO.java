package uk.gov.ons.fsdr.common.dto.action;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobRoleDTO {

  private String uniqueRoleId;

  private String jobRoleType;

  private String jobRole;

  private String lineManagerFirstName;

  private String lineManagerSurname;

  private String areaLocation;

  private String operationalEndDate;

  private String jobRoleShort;

  private Boolean active;

  private String crStatus;

  private String assignmentStatus;

  private String contractStartDate;

  private String contractEndDate;

  private String areaGroup;

  private String coordGroup;

  private String orgUnit;

  private String managerEmployeeId;

  private Boolean isFieldOfficer;

  private Boolean isAreaManager;

  private Boolean isCoordinator;
}
