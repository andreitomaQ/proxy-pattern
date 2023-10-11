package org.example.ex2;

public class ProxyImage implements Image {
    private Image realImage;
    private double[] location = new double[2];
    private String name;
    private boolean border;

    public ProxyImage(String filename) {
        this.name = filename;
    }


    @Override
    public boolean getBorder() {
        if (realImage != null) {
            return realImage.getBorder();
        }

        return border;
    }

    @Override
    public void setBorder(boolean border) {
        if (realImage != null) {
            realImage.setBorder(border);
        } else {
            this.border = border;
        }
    }

    @Override
    public double[] getLocation() {
        if (realImage != null) {
            return realImage.getLocation();
        }

        return location;
    }

    @Override
    public void setLocation(double x, double y) {
        if (realImage != null) {
            realImage.setLocation(x, y);
        } else {
            this.location = new double[]{x, y};
        }
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(name);

            if (border) {
                realImage.setBorder(border);
            }

            if (location != null) {
                realImage.setLocation(location[0], location[1]);
            }
        }

        realImage.display();
    }
}
