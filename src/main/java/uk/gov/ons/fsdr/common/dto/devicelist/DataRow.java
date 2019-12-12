package uk.gov.ons.fsdr.common.dto.devicelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataRow {

  @JsonProperty("ClassName")
  public String className;

  @JsonProperty("Key")
  public String key;

  @JsonProperty("ItemLaunchClassName")
  public String itemLaunchClassName;

  @JsonProperty("ItemLaunchKey")
  public String itemLaunchKey;

  @JsonProperty("Values")
  public DataRowValues dataRowValues;

}
