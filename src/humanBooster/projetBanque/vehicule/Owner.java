package humanBooster.projetBanque.vehicule;

import java.util.ArrayList;

public class Owner {

    private String name;
    private ArrayList<Vehicule> vehicules = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public void countByBrand(String brand) {
        int number = 0;
        for (Vehicule vehicule : vehicules) {
            if (vehicule.brand == brand) {
                ++number;
            }
        }
        System.out.println("Nombre de véhicule possédé de la marque " + brand + ":" + number);
    }

    public void add(Vehicule v) {
        this.vehicules.add(v);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(ArrayList<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("name='").append(name).append('\'');
        sb.append(", vehicules=").append(vehicules);
        sb.append('}');
        return sb.toString();
    }
}
