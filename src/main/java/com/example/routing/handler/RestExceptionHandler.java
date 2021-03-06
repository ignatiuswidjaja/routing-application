package com.example.routing.handler;

import com.example.routing.model.exception.BaseNotFoundException;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
  @ExceptionHandler({BaseNotFoundException.class})
  protected ResponseEntity<Object> handleNotFound(Exception exception, WebRequest request) {
    return handleExceptionInternal(
        exception,
        exception.getMessage(),
        new HttpHeaders(),
        HttpStatus.NOT_FOUND,
        request
    );
  }

  @ExceptionHandler({ConversionFailedException.class})
  public ResponseEntity<Object> handleBadRequest(Exception exception, WebRequest request) {
    return handleExceptionInternal(
        exception,
        exception.getLocalizedMessage().split(";")[0],
        new HttpHeaders(),
        HttpStatus.BAD_REQUEST,
        request
    );
  }
}
