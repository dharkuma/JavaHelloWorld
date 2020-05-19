package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World from Dharmesh Kumar1234!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
