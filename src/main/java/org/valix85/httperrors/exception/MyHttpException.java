package org.valix85.httperrors.exception;

public class MyHttpException extends RuntimeException{
    public MyHttpException(String msg){
        super(msg);
    }
    public MyHttpException() {
        this("Errore generale HTTP");
    }
}
