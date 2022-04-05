package humanBooster.projetBanque.game;

public class Wizard extends Humanoid {

    private int mana;
    private int intelligence;
    private boolean shield;
    private int hitsOnShield;

    public Wizard(String name, double health, int force, int mana, int intelligence) {
        super(name, health, force);
        this.mana = mana;
        this.intelligence = intelligence;
        this.shield = false;
        this.hitsOnShield = 0;
    }

    public void spellCast(Humanoid h) {
        if (this.mana >= 10) {
            System.out.println("Utilisation sort tornade !!!");
            this.mana -= 10;
            System.out.println(this.force + this.intelligence);
            h.receiveDamage(this.force + this.intelligence);
        } else {
            System.out.println("Pas assez de mana pour lancer le sort.");
        }

    }

    public void activateShield() {
        if (this.mana >= 3 && !this.shield) {
            System.out.println("Activation du bouclier magique !!!");
            this.mana -= 3;
            this.shield = true;
            this.hitsOnShield = 0;
        } else {
            System.out.println("Pas assez de mana pour lancer le bouclier magique.");
        }
    }

    public void addMana(int mana) {
        mana += 1;
    }

    @Override
    public void attack(Humanoid h) {
        h.receiveDamage(this.force);
        this.addMana(this.mana);
    }

    @Override
    public void receiveDamage(double damage) {
        if (this.shield && this.hitsOnShield < 5) {
            this.hitsOnShield++;
            this.health -= damage - damage * 0.2;
        } else {
            this.health -= damage;
            this.shield = false;

        }

    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public int getHitsOnShield() {
        return hitsOnShield;
    }

    public void setHitsOnShield(int hitsOnShield) {
        this.hitsOnShield = hitsOnShield;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wizard{");
        sb.append("name='").append(name).append('\'');
        sb.append(", health=").append(health);
        sb.append(", force=").append(force);
        sb.append(", mana=").append(mana);
        sb.append(", intelligence=").append(intelligence);
        sb.append(", shield=").append(shield);
        sb.append(", hitsOnShield=").append(hitsOnShield);
        sb.append('}');
        return sb.toString();
    }
}
