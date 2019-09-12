package uk.gov.ons.fsdr.common.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class AdeccoResponseList {

  String totalSize;

  List<AdeccoResponse> records;

}
