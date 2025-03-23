package com.example;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java -jar app.jar <URL> <User> <Password>");
            System.exit(1);
        }

        String url = args[0];
        String user = args[1];
        String password = args[2];

        System.out.println("Starting application...");
        System.out.println("URL: " + url);
        System.out.println("User: " + user);
        System.out.println("Password: " + password.replaceAll(".", "*")); // Mask password
    }
}
