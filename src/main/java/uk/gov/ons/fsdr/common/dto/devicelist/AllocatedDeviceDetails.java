package uk.gov.ons.fsdr.common.dto.devicelist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllocatedDeviceDetails {
  private String deviceId;
  private String uniqueEmployeeId;
}
