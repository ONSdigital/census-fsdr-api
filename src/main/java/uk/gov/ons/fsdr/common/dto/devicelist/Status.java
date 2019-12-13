package uk.gov.ons.fsdr.common.dto.devicelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {

  @JsonProperty("Title")
  public String title;

}
