package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {

        String message = "GitHub Actions + Nexus";

        System.out.println(StringUtils.upperCase(message));
        System.out.println("Build successful!");
    }
}
