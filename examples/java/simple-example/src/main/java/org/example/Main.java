package org.example;

import org.example.entities.Calculator;

public class Main {
    static void main() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println("Result: " + result);
    }
}
