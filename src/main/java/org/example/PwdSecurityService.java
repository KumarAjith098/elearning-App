package org.example;


import java.util.Base64;

public class PwdSecurityService {
    public String encode(String text){
       Base64.Encoder encoder=Base64.getEncoder();
        String encodeToString = encoder.encodeToString(text.getBytes());
        return encodeToString;
    }
}
