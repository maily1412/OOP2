package Praktikum3;
/**
 * 5b) Testklasse für die Klassen DoLiStudi und Studi.
 */
public class Test {

     //Main-Methode zum Testen der Klassen.
    public static void main(String[] args) {

        Studi studi1 = new Studi ("A", 1);
		Studi studi2 = new Studi ("B", 2);
		Studi studi3 = new Studi ("C", 3);
		Studi studi4 = new Studi ("D", 4);
		Studi studi5 = new Studi ("E", 5);
		Studi studi6 = new Studi ("F", 6);
        
        DoLiStudi listeA = new DoLiStudi();
        DoLiStudi listeB = new DoLiStudi();

        listeA.insertInOrder(studi1);
        listeB.insertInOrder(studi2);
        listeA.insertInOrder(studi3);
        listeB.insertInOrder(studi4);
        listeA.insertInOrder(studi5);
        listeB.insertInOrder(studi6);

        System.out.println("Liste A: " + listeA);
        System.out.println("Liste B: " + listeB);

        

    }

}
