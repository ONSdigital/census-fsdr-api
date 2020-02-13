package uk.gov.ons.fsdr.common.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdeccoResponseList implements Serializable {

  String totalSize;

  List<AdeccoResponse> records;

  boolean done;

  String nextRecordsUrl;

}
