package humanBooster.projetBanque.banque;

public class CompteEpargne extends Compte {

    private final float taux = 0.75f;

    public CompteEpargne(int id, int countComptes) {
        super(id, countComptes);
    }

    public void calculInterets() {
        this.solde += this.solde * this.getTaux();
    }

    public float getTaux() {
        return taux;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteEpargne{");
        sb.append("solde=").append(solde);
        sb.append(", taux=").append(taux);
        sb.append('}');
        return sb.toString();
    }
}
