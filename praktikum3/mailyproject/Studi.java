package praktikum3.mailyproject;

public class Studi implements Comparable {
    private String name;
    private int matrikelnummer;

    Studi(String name, int matrikelnummer){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String toString(){
        return "Name: " + name + ", Matrikelnummer: " + matrikelnummer;
    }

    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo(o.toString());
    }

    
}
