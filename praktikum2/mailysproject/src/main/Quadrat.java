package praktikum2.mailysproject.src.main;

public class Quadrat extends Grafik {

    private int seitenlaenge;

    public Quadrat(int x, int y, String color, int seitenlaenge) {
        super(x, y, color);
        setzeSeitenlaenge(seitenlaenge);
    }

    public int setzeSeitenlaenge(int seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
        return seitenlaenge;
    }

    
    
}
