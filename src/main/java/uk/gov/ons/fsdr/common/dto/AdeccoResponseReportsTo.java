package uk.gov.ons.fsdr.common.dto.devicelist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdeccoResponseReportsTo {

    @JsonProperty("TR1__Closing_Report__r.Reports_To__r.FirstName")
    String lineManagerFirstName;

    @JsonProperty("Hiring_Manager_Last_Name__c")
    String lineManagerSurName;

}
