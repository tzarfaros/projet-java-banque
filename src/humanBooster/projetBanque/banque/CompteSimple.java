package humanBooster.projetBanque.banque;

public class CompteSimple extends Compte{

    private float decouvert;

    public CompteSimple(float decouvert) {
        super();
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float versement) {
        if (this.solde == (this.solde - this.getDecouvert()) || (0 - this.getDecouvert()) > (0 - versement)) {
            System.out.println("Opération refusée, vous n'avez pas les fonds nécessaires.");
        } else {
            this.solde -= versement;
        }
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteSimple{");
        sb.append("solde=").append(solde);
        sb.append(", decouvert=").append(decouvert);
        sb.append('}');
        return sb.toString();
    }
}
