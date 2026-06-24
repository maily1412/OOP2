/**Aufgabe 3: Interface Rollbar
 * 
 */
public interface Rollbar {
    //3a)
    public int rollen();
    /*3b) Versuchen Sie, in diesem Interface eine Variable double geschwindigkeit zu definieren.
 Diese soll angeben wie schnell das Objekt gerollt werden soll.
- Welche Fehlermeldung erhalten Sie nun von der IDE?
-> Error: The blank final field geschwindigkeit may not have been initialized
- Entfernen Sie diese Variable wieder. */
    //double geschwindigkeit;

   /*3c)Auf welche Art und Weise könnte man trotzdem im Interface festlegen, dass man die
Geschwindigkeit von außen einstellen kann, mit der gerollt wird? 
Erklärung: Alle Variablen in Interfaces sind Konstanten (public static final),
final: Wert der Variable ist unveränderlich, darf nach dem Festlegen nicht mehr geändet werden
blank: Variable wurde deklariert, aber nicht initialisiert (ist leer)
Ein Interface hat keinen Konstruktor, d.h. Variable wäre für immer leer & kann im
nachhinein auch nicht initialisiert werden. */

public static double gewschwindigkeit = 0;

} // end of Rollbar
