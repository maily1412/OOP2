package Praktikum2.MailyProject.src.main;

public abstract class Grafik {

    private int x, y;
    private String color;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "Grafik: x=" + x + ", y=" + y + ", color=" + color;
    }

    public Grafik(int x, int y, String color) {
        getX();
        getY();
        getColor();
    }
}
