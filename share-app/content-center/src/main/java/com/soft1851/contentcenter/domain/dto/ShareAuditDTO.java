package com.soft1851.contentcenter.domain.dto;

import com.soft1851.contentcenter.domain.enums.AuditStatusEnum;
import lombok.Data;

/**
 * @ClassName
 * @Description TODO
 * @Author zhent
 * @Date
 **/
@Data
public class ShareAuditDTO {
    /**
     * 审核状态
     */
    private AuditStatusEnum auditStatusEnum;
    /**
     * 原因
     */
    private String reason;
}
