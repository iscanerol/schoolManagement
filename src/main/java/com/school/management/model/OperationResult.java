package com.school.management.model;

public class OperationResult {
    private String errorCode;
    private String description;

    public OperationResult() {
    }

    public OperationResult(String errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
