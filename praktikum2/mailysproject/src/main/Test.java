package praktikum2.mailysproject.src.main;

public class Test {
    public static void main(String[] args) {

        System.out.println("Aufgabe 1");
        Grafik grafik = new Grafik(10, 20, "red") {
            @Override
            public void draw() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        System.out.println(grafik);
        
        /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
        System.out.println("Aufgabe 2");
        Quadrat quadrat = new Quadrat(12, 21, "blue", 5);
        System.out.println(quadrat);

        quadrat.draw();

        /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

        System.out.println("Aufgabe 3");
        Rollbar meineRolle = new Kreis(5, 10, "green", 7);
        meineRolle.rollen();
        System.out.println(meineRolle);

        meineRolle = new Tonne(34);
        meineRolle.rollen();
        System.out.println(meineRolle);


        System.out.println("Comparable Test");
        Comparable comp1 = "Sevgi";
        Comparable comp2 = "Fabio";
         
        System.out.println(comp1.compareTo(comp2));

        comp1 = new Kreis(5, 10, "green", 7);
        comp2 = new Kreis(5, 12, "purple", 8);

        System.out.println("Das Ergebnis ist: " + comp1.compareTo(comp2));


        //comp1 = new Tonne(34);
        //comp2 = new Tonne(12);
        //System.out.println(comp1.compareTo(comp2));

    }
}
