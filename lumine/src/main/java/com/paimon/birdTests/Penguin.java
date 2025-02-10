package com.paimon.birdTests;

public class Penguin extends Bird {
    // Overriding the sayHello method from Bird class
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a penguin!");
    }

    // Overloaded sayHello method with no parameters
    public void sayHello(String name) {
        System.out.println("Hello, I'm a penguin and my name is " + name + "!");
    }

    // Overloaded sayHello method with two parameters
    public void sayHello(String name, int age) {
        System.out.println("Hello, I'm a penguin, my name is " + name + " and I'm " + age + " years old!");
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.sayHello(); // Calls the overridden method
        penguin.sayHello("Pingu"); // Calls the overloaded method with one parameter
        penguin.sayHello("Pingu", 5); // Calls the overloaded method with two parameters
    }
}