package com.school.management.exception.advice;

import com.school.management.exception.ResultException;
import com.school.management.exception.ResultStringException;
import com.school.management.model.OperationResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralControllerAdvice {

    @ExceptionHandler(value = ResultException.class)
    public ResponseEntity<OperationResult> getdfasf(ResultException resultException) {
        return ResponseEntity.ok(new  OperationResult(resultException.getOperationResult().getErrorCode(),
                resultException.getOperationResult().getDescription()));
    }

    @ExceptionHandler(value = ResultStringException.class)
    public ResponseEntity<String> getdfasf(ResultStringException resultException) {
        return ResponseEntity.ok(resultException.getErrorDescription());
    }
}
