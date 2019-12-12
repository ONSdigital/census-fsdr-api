package uk.gov.ons.fsdr.common.dto.devicelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataRowValues {

  @JsonProperty("Status")
  public Status status;

  @JsonProperty("_AllocatedCoOrdinator")
  public AllocatedCoOrdinator allocatedCoOrdinator;

  @JsonProperty("_AllocatedUser")
  public String allocatedUser;

  @JsonProperty("_AllocationDate")
  public String allocationDate;

  @JsonProperty("_DeviceTelephoneNumber")
  public String deviceTelephoneNumber;

  @JsonProperty("_AllocatedEndUserLookup")
  public AllocatedEndUserLookup allocatedEndUserLookup;

  @JsonProperty("_IMEI")
  public String imie;

}
