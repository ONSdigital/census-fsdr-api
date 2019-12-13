package uk.gov.ons.fsdr.common.dto.devicelist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceListQuery {

  @JsonProperty("QueryDefinition")
  public QueryDefinition queryDefinition;

  @JsonProperty("DataRows")
  public List<DataRow> dataRows = null;

  @JsonProperty("CurrentPage")
  public Integer currentPage;

  @JsonProperty("PageCount")
  public Integer pageCount;

  @JsonProperty("TotalCount")
  public Integer totalCount;

  @JsonProperty("ValueStructureType")
  public Integer valueStructureType;

}


