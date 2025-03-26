package com.project.http.web.advice;

import com.project.common.exception.ProjectException;
import com.project.http.controller.dto.ExceptionResponse;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;
import java.util.NoSuchElementException;

@RestControllerAdvice
@RequiredArgsConstructor
public class ExceptionAdvice {
    @ExceptionHandler(ProjectException.class)
    public ResponseEntity<ExceptionResponse> projectException(ProjectException exception) {
        return ResponseEntity
                .status(exception.statusCode)
                .body(ExceptionResponse.of(exception.getMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResponse> baseException(RuntimeException exception) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ExceptionResponse.of(exception.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> baseException(MethodArgumentNotValidException exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ExceptionResponse.of(exception.getBindingResult().getFieldError().getDefaultMessage()));
    }
}
