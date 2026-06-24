/* 1e) Testklasse */
public class Test {


    public static void main(String[] args) {
        // Testobjekte für Aufgabe e)
        // Grafik grafik1 = new Grafik(1,2,"Rot");
        // Grafik grafik2 = new Grafik(3,4,"gelb");
        // Grafik grafik3 = new Grafik(5,6,"grün");

        // Ausgabe der Tesobjekte für Aufgabe e)
        // System.out.println(grafik1.toString()); 
        // System.out.println(grafik2.toString());
        // System.out.println(grafik3.toString());

        //2c)
        Quadrat quadrat1 = new Quadrat(1, 2, "Magenta", 10);
        System.out.println(quadrat1);
        //2e)
        quadrat1.draw();

        //5a)
        Rollbar meineRolle;

        // Zeigt erst auf Kreis
        meineRolle = new Kreis(7, 8, "Orange", 27);
        System.out.println("Der Kreis rollt: " + meineRolle.rollen());

        // Zeigt jetzt auf Tonne
       meineRolle = new Tonne();
       System.out.println("Die Tonne rollt: " + meineRolle.rollen());

       //5b)
       Comparable comp1, comp2;

       // Zeigt auf verschiedene Strings
       comp1 = "Moin!";
       comp2 = "Gruezi!";

       System.out.println("String-Vergleich: " +comp1.compareTo(comp2)); // Das Konsolenergebnis ist der Differnzwert in Unicode.
       

       //5c) Zeigt nun auf Kreise
       comp1 = new Kreis(9, 10, "Lila", 30);
       comp2 = new Kreis(11, 12, "Braun", 35);

       System.out.println("Kreis-Vergleich: " +comp1.compareTo(comp2));

       //5d)
    //    comp1 = new Tonne();
    //    comp2 = new Tonne();
       /* Error Type mismatch: caannot convert from Tonne to Comparable 
       Erklärung comp1 & comp2 sind vom Typ Comparable.
       Tonne implementiert Comparable nicht, nur Rollbar */

       
    
    }

       
    
}
