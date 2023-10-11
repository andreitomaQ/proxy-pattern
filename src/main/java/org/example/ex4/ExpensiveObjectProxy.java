package org.example.ex4;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if (expensiveObject == null) {
            System.out.println("Lazy init ExpensiveObjectImpl instance");
            expensiveObject = new ExpensiveObjectImpl();
        }

        expensiveObject.process();
    }
}
