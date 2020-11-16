package uk.gov.ons.fsdr.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdeccoResponseReportsTo implements Serializable {

    @JsonProperty("FirstName")
    String lineManagerFirstName;

    @JsonProperty("LastName")
    String lineManagerSurName;

}
