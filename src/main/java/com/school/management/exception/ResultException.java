package com.school.management.exception;

import com.school.management.model.OperationResult;

public class ResultException extends RuntimeException {
    private OperationResult operationResult;

    public ResultException(OperationResult operationResult) {
        super(operationResult.getDescription());
        this.operationResult = operationResult;
    }

    public OperationResult getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(OperationResult operationResult) {
        this.operationResult = operationResult;
    }
}
