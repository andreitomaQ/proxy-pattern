package org.example.ex1;

public class ProxyImage implements Image {
    private Image realImage;
    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("LOG before calling RealImage constructor for: " + filename);
            realImage = new RealImage(filename);
            System.out.println("LOG after calling RealImage constructor for: " + filename);
        }
        System.out.println("LOG before calling display() method for: " + filename);
        realImage.display();
        System.out.println("LOG after calling display() method for: " + filename);
    }
}
