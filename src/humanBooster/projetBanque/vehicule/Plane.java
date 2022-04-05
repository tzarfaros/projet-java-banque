package humanBooster.projetBanque.vehicule;

public class Plane extends Vehicule{

    public Plane(int engine, String brand) {
        super(engine, brand);
    }

    public void start() {
        System.out.println("L'avion " + this.brand + " décolle.");
    }

    public void stop() {
        System.out.println("L'avion " + this.brand + " ettérit.");
    }

    public void fly() {
        System.out.println("L'avion vol.");
    }
}
