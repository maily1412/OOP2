package Praktikum3;
/**
 * 1a) Definieren Sie eine Klasse Studi mit den Eigenschaften Name (String) und Matrikelnummer
(int). Beide Eigenschaften werden im Konstruktor der Klasse gesetzt.
1c) Implementieren Sie in der Klasse Studi das Interface java.lang.Comparable und damit die
Methode public int compareTo(Object o). Diese vergleicht das Ziel-Studi-Objekt mit dem
übergebenen Objekt.
. 
 */
public class Studi implements Comparable {

    //Instanzvariablen
    public String name;
    public int matrikelnummer;

    //Konstruktor
    public Studi(String name, int matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    /*
     1b) Definieren Sie in der Klasse Studi die Standard-Methode public String toString(), die
     eine Darstellung des Studi-Objekts als String zurückgibt.
     */
    public String toString() {
        return "Name: " + name + ", Matrikelnummer: " + matrikelnummer;
    }

    public int compareTo(Object studi) {
        return this.toString().compareTo(studi.toString());
    }


    

} // end of Studi class
