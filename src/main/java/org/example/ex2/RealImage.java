package org.example.ex2;

public class RealImage implements Image {
    private double[] location = new double[2];
    private String name;
    private boolean border;

    public RealImage(String filename) {
        System.out.println("Loaded from disk: " + filename);
        this.name = filename;
    }

    @Override
    public boolean getBorder() {
        return border;
    }

    @Override
    public void setBorder(boolean border) {
        this.border = border;
    }

    @Override
    public double[] getLocation() {
        return location;
    }

    @Override
    public void setLocation(double x, double y) {
        this.location[0] = x;
        this.location[1] = y;
    }

    @Override
    public void display() {
        System.out.println("Displayed: " + name);
    }
}
