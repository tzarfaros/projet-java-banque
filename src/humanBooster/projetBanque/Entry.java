package humanBooster.projetBanque;

import humanBooster.projetBanque.banque.Compte;
import humanBooster.projetBanque.banque.CompteEpargne;
import humanBooster.projetBanque.banque.ComptePayant;
import humanBooster.projetBanque.banque.CompteSimple;

public class Entry {

    public static void main(String[] args) {
        exo1();
    }

    public static void exo1() {
        Compte c2 = new CompteSimple(2, 1, 200);
        c2.retirer(100);
        System.out.println(c2);

        System.out.println("--------------");

        Compte c3 = new CompteEpargne(3, 0);
        c3.verser(100);
        ((CompteEpargne)c3).calculInterets();
        System.out.println(c3);

        System.out.println("---------------");

        Compte c4 = new ComptePayant(4, 0);
        c4.verser(100);
        c4.retirer(50);
        System.out.println(c4);
    }
}
