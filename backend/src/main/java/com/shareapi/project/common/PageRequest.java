package com.shareapi.project.common;

import com.shareapi.project.constant.CommonConstant;
import lombok.Data;

/**
 *
 * @author christyg
 */
@Data
public class PageRequest {

    private long current = 1;

    private long pageSize = 10;

    private String sortField;

    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
