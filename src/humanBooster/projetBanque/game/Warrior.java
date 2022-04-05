package humanBooster.projetBanque.game;

public class Warrior extends Humanoid {

    private boolean doubleAttackReady;

    public Warrior(String name, double health, int force) {
        super(name, health, force);
        this.doubleAttackReady = false;
    }

    public void doubleAttack(Humanoid h) {
        System.out.println("Double attaque lancée !!!");
        this.doubleAttackReady = true;
        this.attack(h);
    }

    @Override
    public void attack(Humanoid h) {
       if (this.doubleAttackReady) {
           h.receiveDamage(this.force * 0.7 * 2);
           System.out.println(this.force * 0.7 * 2 + " de dégat.") ;
           this.doubleAttackReady = false;
       } else {
           h.receiveDamage(this.force);
       }
    }

    public boolean getIsDoubleAttackReady() {
        return doubleAttackReady;
    }

    public void setDoubleAttackReady(boolean doubleAttackReady) {
        this.doubleAttackReady = doubleAttackReady;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Warrior{");
        sb.append("name='").append(name).append('\'');
        sb.append(", health=").append(health);
        sb.append(", force=").append(force);
        sb.append(", doubleAttackReady=").append(doubleAttackReady);
        sb.append('}');
        return sb.toString();
    }
}
