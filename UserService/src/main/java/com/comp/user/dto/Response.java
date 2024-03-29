package com.comp.user.dto;

import java.util.Date;

public class Response {
    private String responseCode;
    private String responseMessage;
    private Date date;
    
    public Response(String responseCode, String responseMessage, Date date) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.date = date;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
}
