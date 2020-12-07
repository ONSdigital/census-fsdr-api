package uk.gov.ons.fsdr.common.dto.action;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FsdrDTO {

  private String uniqueEmployeeId;

  private String firstName;

  private String surname;

  private String preferredName;

  private String address1;

  private String address2;

  private String town;

  private String county;

  private String postcode;

  private String country;

  private String personalEmailAddress;

  private String onsId;

  private String telephoneNumberContact1;

  private String telephoneNumberContact2;

  private String emergencyContactFullName;

  private String emergencyContactMobileNo;

  private String status;

  private String mobility;

  private String idBadgeNo;

  private String dob;

  private String dataSource;

  private String onsDevicePhoneNumber;

  private String onsDevicePhoneId;

  private String lineManagerTelephoneContactNo1;

  private JobRoleDTO activeJobRole;

  private JobRoleDTO lastActiveJobRole;

}