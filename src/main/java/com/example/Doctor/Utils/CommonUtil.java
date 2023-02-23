package com.example.Doctor.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {
    public static boolean validatePhoneNumber(String phoneNumber){
        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(phoneNumber);
        return (m.matches());
    }

}
