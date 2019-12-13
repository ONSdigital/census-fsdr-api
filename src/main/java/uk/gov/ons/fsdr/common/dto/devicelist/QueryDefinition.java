package uk.gov.ons.fsdr.common.dto.devicelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryDefinition {

  @JsonProperty("QueryName")
  public String queryName;

  @JsonProperty("Title")
  public String title;

  @JsonProperty("Description")
  public Object description;

  @JsonProperty("PageSize")
  public Integer pageSize;

  @JsonProperty("IsDataGrouped")
  public Boolean isDataGrouped;

  @JsonProperty("RefreshInterval")
  public Integer refreshInterval;

  @JsonProperty("ExpandClass")
  public Object expandClass;

  @JsonProperty("ReportTemplate")
  public Object reportTemplate;

  @JsonProperty("ExpandedReportTemplate")
  public Object expandedReportTemplate;

  @JsonProperty("Conditions")
  public List<Object> conditions = null;

  @JsonProperty("SortAttributes")
  public List<Object> sortAttributes = null;

  @JsonProperty("GroupByTitle")
  public Object groupByTitle;

}
