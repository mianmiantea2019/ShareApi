package com.shareapi.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {

    private String name;

    private String description;

    private String url;

    private String requestHeader;
    private String responseHeader;

    private String method;

}