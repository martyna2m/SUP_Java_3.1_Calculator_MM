package org.example;

public class Calculator<T> {


    public Calculator() {
    }

    public T performOperation(T a, T b, Operation<T> operation) {
        return operation.execute(a, b);

    }

}
