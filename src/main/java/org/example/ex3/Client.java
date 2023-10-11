package org.example.ex3;

public class Client {
    public static void main(String[] args) {
//        Internet internet = new RealInternet();
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
