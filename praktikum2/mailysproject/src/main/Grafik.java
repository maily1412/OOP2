package praktikum2.mailysproject.src.main;

public abstract class Grafik {

    private int x, y;
    private String farbe;


    public int setzeX(int x) {
        this.x = x;
        return x;
    }

    public int setzeY(int y) {
        this.y = y;
        return y;
    }

    public String setzeFarbe(String farbe) {
        this.farbe = farbe;
        return farbe;
    }


    @Override
    public String toString() {
        return "Grafik: x=" + this.x + ", y=" + this.y + ", color=" + this.farbe;
    }

    
    public Grafik(int x, int y, String farbe) {
        setzeX(x);
        setzeY(y);
        setzeFarbe(farbe);
    }

    public void draw() {
        
    }
}
