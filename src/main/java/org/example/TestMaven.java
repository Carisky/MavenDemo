package org.example;

public class TestMaven {
    public static void main(String[] args) {
        System.out.println("Hello: " + AppConfig.getProperty("props.local.hello"));
        System.out.println("Hello from Maven: " + AppConfig.getProperty("props.mvn.hello"));
    }
}
