package humanBooster.projetBanque.banque;

public abstract class Compte {

    private int id;
    protected int solde = 0;
    private static int countComptes;

    public Compte(int solde) {
        this.solde = solde;
        this.id = ++countComptes;
    }

    public void verser(float versement) {
        this.solde += versement;
    }

    public void retirer(float versement) {
        if (this.solde == 0 || this.solde < versement) {
            System.out.println("Opération refusée, vous n'avez pas les fonds nécessaires.");
        } else {
            this.solde -= versement;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountComptes() {
        return countComptes;
    }

    public void setCountComptes(int countComptes) {
        Compte.countComptes = countComptes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte{");
        sb.append("id=").append(id);
        sb.append(", solde=").append(solde);
        sb.append('}');
        return sb.toString();
    }
}
