package org.example.ex4;

public class ExpensiveObjectImpl implements ExpensiveObject {
    public ExpensiveObjectImpl() {
        heavyInitialConfig();
    }

    @Override
    public void process() {
        System.out.println("Processing completed.");
    }

    private void heavyInitialConfig() {
        System.out.println("Loading initial configuration...");
    }
}
