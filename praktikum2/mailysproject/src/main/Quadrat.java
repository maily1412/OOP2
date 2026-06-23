package praktikum2.mailysproject.src.main;

public class Quadrat extends Grafik {

    private int seitenlaenge;

    public Quadrat(int x, int y, String color, int seitenlaenge) {
        super(x, y, color);
        setzeSeitenlaenge(seitenlaenge);
    }

    public void setzeSeitenlaenge(int seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }


    public String toString(){
        return super.toString() + ", seitenlaenge=" + this.seitenlaenge;
    }


    @Override
    public void draw() {
        System.out.println("Zeichne Quadrat");
    }

    
    
}
