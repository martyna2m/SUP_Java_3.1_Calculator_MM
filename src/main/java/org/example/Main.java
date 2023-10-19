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



        Calculator<Double> doubleCalculator = new Calculator<>();


        Operation<Double> multiplyDouble = (a, b) -> a * b;
        Operation<Double> divideDouble = (a, b) -> a / b;




        integerCalculator.performOperation(20, 5, addInt);

        integerCalculator.performOperation(20, 5, extractInt);

        doubleCalculator.performOperation(20.0, 5.0, multiplyDouble);

        doubleCalculator.performOperation(20.0, 5.0, divideDouble);
    }

}


