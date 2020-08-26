package uk.gov.ons.fsdr.common.dto.devicelist;

import lombok.Data;

import java.util.List;

@Data
public class DeviceDto {
    private String onsId;
    private String phoneNumber;
    private String deviceId;

}
