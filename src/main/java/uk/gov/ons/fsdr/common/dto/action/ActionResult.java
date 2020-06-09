package uk.gov.ons.fsdr.common.dto.action;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.fsdr.common.enums.FsdrIndicator;
import uk.gov.ons.fsdr.common.enums.Supplier;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActionResult {

  private String uniqueEmployeeId;

  private FsdrIndicator fsdrIndicator;

  private Supplier source;
}
