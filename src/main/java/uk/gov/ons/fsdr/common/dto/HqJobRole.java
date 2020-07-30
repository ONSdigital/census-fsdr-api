package uk.gov.ons.fsdr.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HqJobRole {

  private String uniqueEmployeeId;

  private String uniqueRoleId;

}
