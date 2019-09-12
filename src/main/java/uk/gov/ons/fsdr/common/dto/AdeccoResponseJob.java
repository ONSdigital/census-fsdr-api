package uk.gov.ons.fsdr.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ApiModel
public class AdeccoResponseJob {

  @JsonProperty("Hiring_Manager_First_Name__c")
  String lineManagerFirstName;

  @JsonProperty("Hiring_Manager_Last_Name__c")
  String lineManagerSurName;

  @JsonProperty("Job_Title__c")
  String jobRole;

  @JsonProperty("Job_Role__r")
  AdeccoResponseJobRole responseJob;

  @JsonProperty("Role_Code__c")
  String roleId;
}
