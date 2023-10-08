package com.shareapi.project.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author christyg
 */
@Data
public class UserAddRequest implements Serializable {

  
    private String userName;

    private String userAccount;

    private String userAvatar;

  
    private Integer gender;

   
    private String userRole;

    x
    private String userPassword;

    private static final long serialVersionUID = 1L;
}