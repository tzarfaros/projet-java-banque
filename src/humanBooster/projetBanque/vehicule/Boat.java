package humanBooster.projetBanque.vehicule;

public class Boat extends Vehicule implements Flottant{

    public Boat(int engine, String brand) {
        super(engine, brand);
    }

    public void start() {
        System.out.println("Le bateau " + this.brand + " lève l'ancre.");
    }

    public void stop() {
        System.out.println("Le bateau " + this.brand + " jette l'ancre.");
    }

    public void sail() {
        System.out.println("Le bateau navigue.");
    }

    @Override
    public void naviguer() {

    }

    @Override
    public void leverAncre() {

    }

    @Override
    public void jeterAncre() {

    }
}
