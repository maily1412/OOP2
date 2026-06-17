package praktikum2.mailysproject.src.main;

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
        return "Grafik: x=" + getX() + ", y=" + getY() + ", color=" + getColor();
    }

    public Grafik(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw() {
        
    }
}
