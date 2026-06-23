package praktikum3.mailyproject;

public class Test {
    public static void main(String[] args) {
        Studi studi1 = new Studi("Ikki", 12345);
        Studi studi2 = new Studi("Dari", 54321);
        Studi studi3 = new Studi("Kiki", 14680);
        
        System.out.println("Das ist Studi 1: " + studi1);
        System.out.println("Das ist Studi 2: " + studi2);
        System.out.println("Vergleich: " + studi1.compareTo(studi2));

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        DoLiStudi doLiStudi = new DoLiStudi();
        doLiStudi.insertInOrder(studi1);
        doLiStudi.insertInOrder(studi2);
        doLiStudi.insertInOrder(studi3);
        System.out.println(doLiStudi);
    }
}
