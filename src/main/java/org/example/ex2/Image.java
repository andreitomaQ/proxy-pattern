package org.example.ex2;

public interface Image {
    boolean getBorder();

    void setBorder(boolean border);

    double[] getLocation();

    void setLocation(double x, double y);

    void display();
}
