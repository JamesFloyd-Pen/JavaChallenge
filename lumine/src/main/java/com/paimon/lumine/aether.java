package com.paimon.lumine;

import java.util.Scanner;

public class aether {
    private String name;
    private String paimon;

    public static void main(String[] args) {
        System.out.println("Hello, I am " + new aether().getName() + " and this is " + new aether().getPaimon() + "!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String inputName = scanner.nextLine();
        aether aetherInstance = new aether();
        aetherInstance.setName(inputName);
        System.out.println("Now, I am " + aetherInstance.getName() + " and this is " + aetherInstance.getPaimon() + "!");
    }

    public aether() {
        // Constructor for Aether class
        this.name = "Aether";
        this.paimon = "Paimon";
    }

    public String getName() {
        return name;
    }

    public String getPaimon() {
        return paimon;
    }

    public void setName(String name)    {
        this.name = name;
    }
    
    public void setPaimon(String paimon) {
        this.paimon = paimon;
    }
}
