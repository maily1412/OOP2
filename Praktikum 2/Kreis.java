/**
 * 4c) Definieren Sie eine Klasse Kreis als Subklasse von Grafik, mit einem Radius als InstanzVariable. Außerdem soll die Klasse die beiden Interfaces Rollbar und
java.lang.Comparable (aus der Java-API, siehe Anmerkungen unten 1
) implementieren.
 */
public class Kreis extends Grafik implements Rollbar, Comparable{ 

    private int radius;

    // Konstruktor
    public Kreis(int x, int y, String farbe, int radius) {
        super(x, y, farbe);
        this.radius = radius;
    }

    public String toString() {
        return "Kreis: " + super.toString() + ", Radius: " + radius;
    }

    // Methoden, die definiert werden müssen, da die Klasse Kreis die Interfaces Rollbar und Comparable implementiert
    public void draw() {
        System.out.println("Kreis: " + toString() + " wird gezeichnet.");
    }

    public int rollen() {
        return 0;
    }

    public int compareTo(Object objekt) {
        return 0;
    }



}
