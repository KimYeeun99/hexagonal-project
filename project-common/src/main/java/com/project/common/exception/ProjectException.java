package com.project.common.exception;

import jakarta.validation.constraints.NotNull;

public class ProjectException extends RuntimeException{
    @NotNull public final int statusCode;
    @NotNull public final String defaultMessage;
    public final String detailMessage;

    public ProjectException(ExceptionCode exceptionCode) {
        this.statusCode = exceptionCode.getStatusCode();
        this.defaultMessage = exceptionCode.getMessage();
        this.detailMessage = "";
    }

    public ProjectException(ExceptionCode exceptionCode, String message) {
        this.statusCode = exceptionCode.getStatusCode();
        this.defaultMessage = exceptionCode.getMessage();
        this.detailMessage = message;
    }

    public String getMessage() {
        if (detailMessage != null) {
            return  "[" + defaultMessage + "] " + detailMessage;
        }
        return defaultMessage;
    }
}
