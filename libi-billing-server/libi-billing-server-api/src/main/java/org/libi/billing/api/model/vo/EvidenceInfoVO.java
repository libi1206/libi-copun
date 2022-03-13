package org.libi.billing.api.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/7/21 3:14 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EvidenceInfoVO {
    private String evidenceId;
    private String evidenceName;
    private Integer evidenceType;
    private String userId;
}
