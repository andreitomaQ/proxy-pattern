package org.example.ex1;

public class ProxyPatternExample {
    public static void main(String[] args) {
//        Image image = new RealImage("image1.jpg");
        Image image = new ProxyImage("image1.jpg");
        image.display();
    }
}