package com.shareapi.project.model.dto.user;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author christyg
 */
@Data
public class UserUpdateRequest implements Serializable {
    
    private Long id;

    private String userName;

    private String userAccount;

    private String userAvatar;

   
    private Integer gender;

  
    private String userRole;
 
    private String userPassword;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}