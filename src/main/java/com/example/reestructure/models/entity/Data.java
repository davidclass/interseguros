package com.example.reestructure.models.entity;

public class Data {

    /** VARIABLES **/
    private String sessionKey;
    private String expirationTime;

    /** METODOS **/

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }
}
