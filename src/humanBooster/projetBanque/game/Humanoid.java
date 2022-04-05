package humanBooster.projetBanque.game;

public abstract class Humanoid {

    protected String name;
    protected double health;
    protected int force;

    public Humanoid(String name, double health, int force) {
        this.name = name;
        this.health = health;
        this.force = force;
    }

    public void attack(Humanoid h) {
        h.receiveDamage(this.force);
    }

    public void receiveDamage(double damage) {
        this.health -= damage;
    }

}
