/**
 * Aufgabe 2 
 * Definieren Sie die Klasse Quadrat als Subklasse von Grafik.
 * 2a) Bereits beim Definieren von Quadrat als Subklasse meldet die IDE Eclipse
wieder einen Fehler durch ein Icon am linken Rand:
Error1: The type Quadrat must implement the inherited abstract method Grafik.draw()
Error2: Implicit super constructor Grafik() is undefined for default constructor. Must define an explicit constructor
Beheben Sie die angegebene Fehlermeldung sinnvoll, d.h. durch Definition der fehlenden Methode,
die hier in der Implementierung nur etwas auf die Konsole ausgeben braucht
 */
public class Quadrat extends Grafik {

    // 2b) Definieren Sie die Länge des Quadrats als zusätzliche, natürlich private, Eigenschaft.
    private int laenge; // muss natürlich auch in den Konstruktor!!!

    /* -> löst Error1
    Erklärung: Die Methode draw() muss implementiert werden, 
    da sie in der abstrakten Klasse Grafik, ohne Deklaration definiert ist. 
    Die draw()-Methode muss also in der Subklasse deklariert werden. */
    public void draw() {
        System.out.println("Quadrat: " +toString() + " wird gezeichnet.");
    }

    /* 2c) Definieren Sie einen Konstruktor, der Position, Länge und Farbe des Quadrats setzt.
    -> löst Error2
    Erklärung: Der Standardkonstruktor von Grafik ist nicht definiert.
    Ein expliziter Konstruktor muss definiert werden. */
    public Quadrat(int x, int y, String farbe, int laenge) {
        super(x, y, farbe);
        this.laenge = laenge;
    }

    // setzt due Länge des Quadrats
    void laengeSetzen(int laenge) {
        this.laenge = laenge;
    }

    //gibt das Quadrat aus, alle Eigenschaften aus der Superklasse + die Länge. 
    public String toString() {
        return "Quadrat: " + super.toString() + ", Länge: " + laenge;
    }
} // end of class Quadrat
