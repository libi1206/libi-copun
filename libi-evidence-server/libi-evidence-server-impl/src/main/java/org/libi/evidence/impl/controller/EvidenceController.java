package org.libi.evidence.impl.controller;

import org.libi.evidence.api.model.dto.EvidenceInfoDto;
import org.libi.evidence.impl.service.biz.EvidenceBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 12:27 AM
 */
@RestController
@RequestMapping("/api/evidence")
@EnableFeignClients(basePackages = "org.libi")
public class EvidenceController {
    @Autowired
    private EvidenceBusinessService evidenceBusinessService;

    @PostMapping("/doEvidence")
    public String doEvidence(
            @RequestBody EvidenceInfoDto evidenceInfoDto
    ) {
        return evidenceBusinessService.doOnceEvidence(evidenceInfoDto);
    }

}
