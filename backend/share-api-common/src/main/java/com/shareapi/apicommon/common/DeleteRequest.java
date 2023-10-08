package com.shareapi.shareapicommon.common;

import java.io.Serializable;
import lombok.Data;

@Data
public class DeleteRequest implements Serializable {
    private Long id;
    private static final long serialVersionUID = 1L;
}
