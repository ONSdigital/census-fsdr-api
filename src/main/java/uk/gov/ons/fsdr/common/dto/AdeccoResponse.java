package uk.gov.ons.fsdr.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ApiModel
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AdeccoResponse {

  @JsonProperty("TR1__Start_Date__c")
  String contractStartDate;

  @JsonProperty("TR1__Contract_End_Date__c")
  String contractEndDate;

  @JsonProperty("TR1__End_Date__c")
  String operationalEndDate;

  @JsonProperty("Contracted_Hours__c")
  Double weeklyHours;

  @JsonProperty("TR1__Person_Placed__r")
  AdeccoResponseContact responseContact;

  @JsonProperty("TR1__Job__r")
  AdeccoResponseJob responseJob;

  @JsonProperty("Name")
  String idBadgeNumber;

  @JsonProperty("Worker__r")
  AdeccoResponseWorker adeccoResponseWorker;

}
