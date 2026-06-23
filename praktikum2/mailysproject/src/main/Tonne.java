package praktikum2.mailysproject.src.main;

public class Tonne implements Rollbar {
    private double geschwindigkeit;
    
    public Tonne(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public String toString() {
        return "Tonne: geschwindigkeit=" + this.geschwindigkeit;
    }
    
    @Override
    public int rollen() {
        return 2;
    }
    
}
