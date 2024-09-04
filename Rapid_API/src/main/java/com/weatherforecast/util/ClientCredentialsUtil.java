package com.weatherforecast.util;


import java.util.UUID;

public class ClientCredentialsUtil {

    public static String generateClientId() {
        return UUID.randomUUID().toString();
    }

    public static String generateClientSecret() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
