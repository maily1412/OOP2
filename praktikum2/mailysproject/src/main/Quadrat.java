package praktikum2.mailysproject.src.main;

public class Quadrat extends Grafik {

    private int seitenlaenge;

    public Quadrat(int x, int y, String color, int seitenlaenge) {
        super(x, y, color);
        this.seitenlaenge = seitenlaenge;
    }

    public int getSeitenlaenge() {
        return seitenlaenge;
    }

    @Override
    public String toString() {
        return "Quadrat: x=" + getX() + ", y=" + getY() + ", color=" + getColor() + ", seitenlaenge=" + getSeitenlaenge();
    }
    
}
