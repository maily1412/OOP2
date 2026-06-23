package praktikum2.mailysproject.src.main;

public class Kreis extends Grafik implements Rollbar, Comparable {
    
    private int radius;

    public Kreis(int x, int y, String farbe, int radius) {
        super(x, y, farbe);
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + ", radius=" + this.radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Kreis wird gezeichnet");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int rollen() {
        return 1;
    }
    
}
