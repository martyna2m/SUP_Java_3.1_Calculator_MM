package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator<Integer> integerCalculator = new Calculator<>();

        Operation<Integer> addInt = new Operation<>() {
            @Override
            public Integer execute(Integer a, Integer b) {
                return a + b;
            }
        };

        Operation<Integer> extractInt = new Operation<>() {
            @Override
            public Integer execute(Integer a, Integer b) {
                return a - b;
            }
        };


        integerCalculator.performOperation(20, 5, addInt);

        integerCalculator.performOperation(20, 5, extractInt);

        Calculator<Double> doubleCalculator = new Calculator<>();


        doubleCalculator.performOperation(20.0, 5.0, (a, b) -> a * b);
        doubleCalculator.performOperation(20.0, 5.0, (a, b) -> a / b);






    }

}


