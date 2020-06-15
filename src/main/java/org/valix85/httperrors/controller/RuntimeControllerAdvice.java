package org.valix85.httperrors.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.valix85.httperrors.dto.SimpleResponse;
import org.valix85.httperrors.exception.MyHttpException;

@ControllerAdvice
public class RuntimeControllerAdvice {

    @ExceptionHandler({ MyHttpException.class, java.lang.NumberFormatException.class, HttpClientErrorException.NotFound.class})
    public final ResponseEntity handleException(Exception ex, WebRequest request) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("MyCustomKey","123456789");

        if (ex instanceof HttpClientErrorException.NotFound) {
            HttpStatus status = HttpStatus.NOT_FOUND;
            MyHttpException unfe = new MyHttpException("Pagina non trovata");
            return new ResponseEntity(unfe, headers, status);
        }

        if ( ex instanceof java.lang.NumberFormatException ){
            HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
            SimpleResponse unfe = new SimpleResponse(status.value());
            unfe.setMessage("Errore di elaborazione sul server, codice http non valido");
            return new ResponseEntity(unfe, headers, status);
        }
        return new ResponseEntity(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }



}
