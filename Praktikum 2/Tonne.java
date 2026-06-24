/**
 * Aufgabe 4: Kreis & Tonne
 * 4a) Definieren Sie eine Klasse Tonne, die das Interface Rollbar implementiert.
 * Error: The type Tonne must implement the inherited abstract method Rollbar.rollen()
 */
public class Tonne implements Rollbar {

    /*b) Welche Methode müssen (!) Sie in der Klasse Tonne implementieren, damit keine Fehlermeldung
erscheint? Warum?
-> Die Methode rollen() muss implementiert werden, da sie im Interface Rollbar definiert ist. */
    public int rollen() {
        return 0;
    }

}
