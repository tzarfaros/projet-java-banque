package humanBooster.projetBanque.banque;

public class ComptePayant extends Compte {

    public ComptePayant(int solde) {
        super(solde);
    }

    @Override
    public void verser(float versement) {
        this.solde += versement - 1;
    }

    @Override
    public void retirer(float versement) {
        if (this.solde == 0 || this.solde < versement) {
            System.out.println("Opération refusée, vous n'avez pas les fonds nécessaires.");
        } else {
            this.solde -= versement + 1;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
