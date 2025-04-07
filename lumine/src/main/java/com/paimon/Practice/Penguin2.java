package com.paimon.Practice;

public class Penguin2 {
    public static void main(String[] args){
        int lowest = 2, highest = 10;
        Penguin2 penguin = new Penguin2();
        //penguin.midPoint(lowest, highest);
        //penguin.antiderivativeFormula();
        System.out.println("Penguin");

        int coefficient = 3; // Coefficient of the term
        int exponent = 2;    // Exponent of the term

        String derivative = findDerivative(coefficient, exponent);
        System.out.println("Derivative: " + derivative);
    }
    

    public void midPoint(int lowest, int highest){
        int mid = (lowest + highest) / 2;
        System.out.println("Midpoint: " + mid);

    }

    public void antiderivativeFormula(){
        // Antiderivative formula: ∫x^n dx = (x^(n+1))/(n+1) + C
        // where n is a constant and C is the constant of integration
        int n = 2; // Example value for n
        int x = 3; // Example value for x
        double antiderivative = Math.pow(x, n + 1) / (n + 1);
        System.out.println("Antiderivative: " + antiderivative);
    }

    public static String findDerivative(int coefficient, int exponent) {
        // Derivative of ax^n is n * a * x^(n-1)
        if (exponent == 0) {
            return "0"; // The derivative of a constant is 0
        }

        int newCoefficient = coefficient * exponent;
        int newExponent = exponent - 1;

        if (newExponent == 0) {
            return String.valueOf(newCoefficient); // If the exponent becomes 0, it's just the coefficient
        }

        return newCoefficient + "x^" + newExponent;
    }



}

