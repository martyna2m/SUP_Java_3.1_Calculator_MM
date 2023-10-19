package org.example;

public class Calculator<T>  {


    public Calculator() {
    }

    public void performOperation(T a, T b, Operation<T> operation) {
        System.out.println("Result = " + operation.execute(a, b));

    }

}
