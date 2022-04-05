package humanBooster.projetBanque.vehicule;

public abstract class Vehicule {

    private int engine;
    protected String brand;

    public Vehicule(int engine, String brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public abstract void start();
    public abstract void stop();

    public final void displayEngine() {
        System.out.println("Le véhicule " + this.brand + " a une puissance de " + this.engine);
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicule{");
        sb.append("engine=").append(engine);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
