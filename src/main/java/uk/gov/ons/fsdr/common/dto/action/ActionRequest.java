package uk.gov.ons.fsdr.common.dto.action;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.fsdr.common.enums.FsdrIndicator;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActionRequest {

  private FsdrDTO employee;

  private FsdrIndicator action;
}
