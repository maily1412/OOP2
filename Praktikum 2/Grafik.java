/**
 * 1a) Definieren Sie eine Klasse Grafik mit Eigenschaften einer Grafik,
 *  zunächst mit Daten, z.B. für die Position x und y (als Zahlenwert) 
 * sowie die farbe (String) einer Grafik
Diese Eigenschaften sollen außerhalb der Klasse nicht sichtbar sein,
auch nicht in den Subklassen (!).
 */
abstract class Grafik {

private int position_x, position_y;
private String farbe;

/* 1b) Definieren Sie als weitere Eigenschaften eine Methode,
die eine Grafik in x und y Koordinaten positioniert, 
sowie eine Methode, die die Farbe der Grafik setzt.
 */
public void setzePosition(int x, int y) {
    this.position_x = x;
    this.position_y = y;
}

public void setzeFarbe(String farbe) {
    this.farbe = farbe;
}

/* 1c) Definieren Sie eine Methode, die Eigenschaften (Position und Farbe)
 einer Grafik zu Testzwecken als String zurückgibt. */ 
public String toString() {
    return "Grafik [Position: (" + position_x + ", " + position_y + "), Farbe: " + farbe + "]";
}

/* 1d) Definieren Sie einen Konstruktor, mit dem man alle diese Eigenschaften setzen kann.
Hinweis: nutzen Sie dafür die oben definierten Methoden
 */
public Grafik(int x, int y, String farbe) {
    // Standardkonstruktor
    setzePosition(x, y); // Standardposition
    setzeFarbe(farbe); // Standardfarbe
    toString(); // Standardausgabe
}

/* 1f) Definieren Sie nun in der Klasse Grafik eine abstrakte Methode draw(), um etwas zu zeichnen.
-> Welchen Hinweis der IDE Eclipse bekommen Sie nach der Definition dieser abstrakten Methode?
- The type Grafik must be an abstract class to define abstract methods
- The abstract method draw in type Grafik can only be defined by an abstract class
Warum gibt es zu Recht diese Fehlermeldung? Was müssen Sie tun, um diese
Meldung zum Verschwinden zu bringen (Die abstrakte Methode soll natürlich abstrakt bleiben!) ? 
- Man muss den Access Modifier von public auf abstract ändern */
public abstract void draw();

} //end of class Grafik