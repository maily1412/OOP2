package praktikum2.mailysproject.src.main;

public abstract class Grafik {

    private int x, y;
    private String farbe;


    public void setzePosition(int positionX, int positionY){
        x = positionX;
        y = positionY;
    }


    public void setzeFarbe(String farbe) {
        this.farbe = farbe;
    }


    @Override
    public String toString() {
        return "Grafik: x=" + this.x + ", y=" + this.y + ", color=" + this.farbe;
    }

    
    public Grafik(int x, int y, String farbe) {
        setzePosition(x, y);
        setzeFarbe(farbe);
    }



     /*
    Fehler: Abstrakte Methode bedeutet, dass die Klasse auch abstrakt sein muss.
    */
    public abstract void draw();

}
