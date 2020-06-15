package org.valix85.httperrors.dto;

import java.time.LocalDateTime;


public class SimpleResponse {
    private String message;
    private LocalDateTime datetime;
    private int httpCode;

    public SimpleResponse(int code){
        this.message = "Risposta da Spring...\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam viverra, lacus et viverra imperdiet, magna eros fringilla ante, eget pulvinar dui mi a magna. Vestibulum rhoncus mauris eget nibh fringilla, vitae tristique metus accumsan. Suspendisse eget euismod orci, in sollicitudin purus. Nam tempor viverra libero, ac luctus lorem ultrices non. Integer iaculis sapien ipsum, laoreet efficitur purus convallis non. Vestibulum tincidunt ex eu leo luctus feugiat. Maecenas ullamcorper eros ac placerat mattis. Etiam a quam laoreet, congue dolor a, convallis neque.";
        this.datetime = LocalDateTime.now();
        this.httpCode = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public int getHttpCode() {
        return httpCode;
    }
}
