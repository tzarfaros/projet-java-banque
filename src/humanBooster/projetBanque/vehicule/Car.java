package humanBooster.projetBanque.vehicule;

public class Car extends Vehicule implements Roulant{

    public Car(int engine, String brand) {
        super(engine, brand);
    }

    public void start() {
        System.out.println("La voiture " + this.brand + " prend la route.");
    }

    public void stop() {
        System.out.println("La voiture " + this.brand + " se gare sur le bas côté.");
    }

    @Override
    public void rouler() {

    }
}
