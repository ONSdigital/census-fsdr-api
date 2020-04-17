package uk.gov.ons.fsdr.common.dto.devicelist;

import lombok.Data;

import java.util.List;

@Data
public class DeviceDto {

    private List<Account> accounts;
    private String imeiNumber;
    private String networkCountryISO;
    private String phoneNumber;
    private String phoneType;
    private Boolean roaming;
    private String simCountryISO;
    private String simSerialNumber;
    private String softwareVersion;
    private String voiceMailNumber;

}
