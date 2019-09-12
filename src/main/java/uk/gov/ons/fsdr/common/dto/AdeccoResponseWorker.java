package uk.gov.ons.fsdr.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ApiModel
public class AdeccoResponseWorker {

  @JsonProperty("Id")
  String employeeId;
}
