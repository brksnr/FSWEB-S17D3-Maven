package com.workintech.zoo.exceptions;

public class ZooErrorResponse {
    private String message;
    private int status;
    private long timestamp;

    public ZooErrorResponse(String message, int status, long timestamp) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
