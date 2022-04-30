package com.school.management.exception;

public class ResultStringException extends RuntimeException {
    private String errorDescription;

    public ResultStringException(String errorDescription) {
        super(errorDescription);
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
