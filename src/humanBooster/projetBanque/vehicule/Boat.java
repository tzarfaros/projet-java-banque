package humanBooster.projetBanque.vehicule;

public class Boat extends Vehicule{

    public Boat(int engine, String brand) {
        super(engine, brand);
    }

    public void start() {
        System.out.println("Le bateau " + this.brand + " lève l'ancre.");
    }

    public void stop() {
        System.out.println("Le bateau " + this.brand + " jette l'ancre.");
    }
}
