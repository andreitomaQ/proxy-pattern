package org.example.ex2;

public class Client {
    public static void main(String[] args) {
//        Image img = new RealImage("pic.jpg");
        Image img = new ProxyImage("pic.jpg");

        img.setLocation(1, 2);
        img.setBorder(true);

        System.out.println("\n-- Image Details --");
        System.out.println("Image Border : " + img.getBorder());
        System.out.println("Image location : (" + img.getLocation()[0] + "," +
                img.getLocation()[1] + ")");

        System.out.println("\n\n-- Displaying image now --");
        img.display();
    }
}
