package com.soft1851.contentcenter.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * author wanghuanle
 */
@Getter
@AllArgsConstructor
public enum AuditStatusEnum {
    /**
     * 待审核
     */
    NOT_YET,
    /**
     * 审核通过
     */
    PASSED,
    /**
     * 审核不通过
     */
    REJECT
}
