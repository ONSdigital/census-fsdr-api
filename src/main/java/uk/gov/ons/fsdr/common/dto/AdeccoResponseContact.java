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
public class AdeccoResponseContact implements Serializable {

  @JsonProperty("Id")
  String employeeId;

  @JsonProperty("FirstName")
  String firstName;

  @JsonProperty("LastName")
  String lastName;

  @JsonProperty("TR1__Other_Name__c")
  String preferredName;

  @JsonProperty("Address_Line_1__c")
  String addressLine1;

  @JsonProperty("Address_Line_2__c")
  String addressLine2;

  @JsonProperty("Town__c")
  String town;

  @JsonProperty("County__c")
  String county;

  @JsonProperty("Postcode__c")
  String postcode;

  @JsonProperty("Email")
  String personalEmail;

  @JsonProperty("MobilePhone")
  String telephoneNo1;

  @JsonProperty("HomePhone")
  String telephoneNo2;

  @JsonProperty("Emergency_Contact__c")
  String emergencyContact;

  @JsonProperty("Emergency_Contact_Number__c")
  String emergencyContactNumber1;

  @JsonProperty("ONS_Travel_Distance__c")
  String mobility;

  @JsonProperty("Birthdate")
  String dob;

  @JsonProperty("Local_Authority_Area_Id__r")
  LocalAuthorityArea localAuthorityArea;

  //  @JsonProperty("")
  String areaLocation = "none";

}
