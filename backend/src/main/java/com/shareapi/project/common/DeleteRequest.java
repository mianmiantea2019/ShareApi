package com.shareapi.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author christyg
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}