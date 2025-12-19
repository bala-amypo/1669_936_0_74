package cmo.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
publc class GlobalException{
    @ExceptionHandler(ValidationException.class)
}