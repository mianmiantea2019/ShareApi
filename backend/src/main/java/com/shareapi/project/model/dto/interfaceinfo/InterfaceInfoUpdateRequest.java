package com.shareapi.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;


@Data
public class InterfaceInfoUpdateRequest implements Serializable {

    
    private Long id;

   
    private String name;

   
    private String description;

   
    private String url;

    private String requestHeader;

   
    private String responseHeader;

    
    private Integer status;

    
    private String method;

    private static final long serialVersionUID = 1L;
}