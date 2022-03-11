package org.libi.evidence.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 12:03 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EvidenceInfoDto {
    private String userId;
    private String context;
}
