package uk.gov.ons.fsdr.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdeccoResponseJob implements Serializable {

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
