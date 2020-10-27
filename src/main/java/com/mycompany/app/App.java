package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World, I am running My First Maven Project!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
