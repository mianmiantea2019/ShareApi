package com.shareapi.shareapicommon.common;

public enum ErrorCode {

    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "Request parameter error"),
    NOT_LOGIN_ERROR(40100, "not logged in"),
    NO_AUTH_ERROR(40101, "No Authority"),
    NOT_FOUND_ERROR (40400, "Request data does not exist"),
    FORBIDDEN_ERROR (40300, "Prohibited Access"),
    SYSTEM_ERROR(50000, "System Internal Exception"),
    OPERATION_ERROR (50001, "Operation failed");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
