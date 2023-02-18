package com.driver;

import java.util.Date;

public class Mail {
    private Date date;
    private String senderId;
    private String message;

    public Mail(Date date, String senderId, String message) {
        this.date = date;
        this.senderId = senderId;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getMessage() {
        return message;
    }
}
