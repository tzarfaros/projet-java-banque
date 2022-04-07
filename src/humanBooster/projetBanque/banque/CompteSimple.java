package humanBooster.projetBanque.banque;

import humanBooster.projetBanque.exceptions.DecouvertException;
import humanBooster.projetBanque.exceptions.RetraitException;

public class CompteSimple extends Compte{

    private float decouvert;

    public CompteSimple(float solde, float decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float montant) throws RetraitException, DecouvertException {
        if(montant > solde + this.decouvert){
            throw new DecouvertException("Solde insuffisant: "+solde);
        }else{
            System.out.println("Transaction ok");
            this.solde -= montant;
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
