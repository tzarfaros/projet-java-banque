package humanBooster.projetBanque.game;

public class Berseker extends Humanoid {

    private int rage;

    public Berseker(String name, double health, int force, int rage) {
        super(name, health, force);
        this.rage = rage;
    }

    public void useRage(Humanoid h) {
        int forceInitial = this.force;
        if (this.rage >= 8) {
            System.out.println("Mode rage activé !!");
            this.rage -= 8;
            this.force *= 1.5;
            this.attack(h);
            this.force = forceInitial;
        } else {
            System.out.println("Pas assez de rage pour lancer la capacité.");
        }
    }

    public void addRage(int rage) {
        this.rage += 3;
    }

    @Override
    public void attack(Humanoid h) {
        h.receiveDamage(this.force);
    }

    @Override
    public void receiveDamage(double damage) {
        this.health -= damage;
        this.addRage(this.rage);
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Berseker{");
        sb.append("rage=").append(rage);
        sb.append(", name='").append(name).append('\'');
        sb.append(", health=").append(health);
        sb.append(", force=").append(force);
        sb.append('}');
        return sb.toString();
    }
}

