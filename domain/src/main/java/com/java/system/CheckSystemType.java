package com.java.system;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckSystemType {

    public static void main(String[] args) throws UnknownHostException {
        System.out.printf("Current os: ");
        System.out.println(System.getProperty("os.name"));
        String ip = InetAddress.getLocalHost().getHostAddress();
        System.out.printf("localhost ip: %s\n", ip);
    }
}
