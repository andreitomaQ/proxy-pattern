package org.example.ex4;

public class Client {
    public static void main(String[] args) {
//        ExpensiveObject expensiveObject = new ExpensiveObjectImpl();
        ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
        expensiveObject.process();
        expensiveObject.process();
    }
}
