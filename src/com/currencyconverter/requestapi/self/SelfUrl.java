package com.currencyconverter.requestapi.self;

public class SelfUrl {

    public static String getPairUrlPart(String money1, String money2) {

        String m1 = (money1 == null || money1.trim().isEmpty()) ? "" : money1.toUpperCase();
        String m2 = (money2 == null || money2.trim().isEmpty()) ? "" : money2.toUpperCase();
        return m1 + "/" + m2 + "/";
    }
}
