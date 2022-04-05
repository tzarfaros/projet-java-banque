package humanBooster.projetBanque;

import humanBooster.projetBanque.banque.Compte;
import humanBooster.projetBanque.banque.CompteEpargne;
import humanBooster.projetBanque.banque.ComptePayant;
import humanBooster.projetBanque.banque.CompteSimple;
import humanBooster.projetBanque.game.Berseker;
import humanBooster.projetBanque.game.Humanoid;
import humanBooster.projetBanque.game.Warrior;
import humanBooster.projetBanque.game.Wizard;
import humanBooster.projetBanque.vehicule.*;

public class Entry {

    public static void main(String[] args) {
        testWizard();

    }

    public static void exo2() {
        Owner o = new Owner("Macron");

        Vehicule v1 = new Car(10, "taurus");
        Vehicule v2 = new Boat(100, "taurus");
        Vehicule v3 = new Plane(1000, "taurus");

        v1.start();
        v1.stop();
        v2.start();
        v2.stop();
        v3.start();
        v3.stop();

        v1.displayEngine();

        o.add(v1);
        o.add(v2);
        o.add(v3);
        o.countByBrand("taurus");
    }

    public static void testWizard() {
        Humanoid h1 = new Berseker("berserker", 80, 30, 20);
        Humanoid h2 = new Wizard("wizard", 60, 15, 40, 25);
        Humanoid h3 = new Warrior("warrior", 120, 20);

        System.out.println("Combat entre Wizard et Berseker :");
        System.out.println(h1);
        System.out.println(h2);
        h2.attack(h1);
        System.out.println(h1);
        ((Berseker)h1).useRage(h2);
        System.out.println(h1);
        System.out.println(h2);
    }

    public static void testBerserker() {
        Humanoid h1 = new Berseker("berserker", 80, 30, 20);
        Humanoid h2 = new Wizard("wizard", 60, 15, 40, 25);

        System.out.println("Combat entre Berserker et Wizard :");
        System.out.println(h1);
        System.out.println(h2);
        h1.attack(h2);
        System.out.println(h2);
        ((Berseker)h1).useRage(h2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("Wizard attaque le Berserker :");
        h2.attack(h1);
        System.out.println(h1);
    }


    public static void exo1() {
        Compte c2 = new CompteSimple(0, 200);
        c2.retirer(100);
        System.out.println(c2);

        System.out.println("--------------");

        Compte c3 = new CompteEpargne(0);
        c3.verser(100);
        ((CompteEpargne)c3).calculInterets();
        System.out.println(c3);

        System.out.println("---------------");

        Compte c4 = new ComptePayant(0);
        c4.verser(100);
        c4.retirer(50);
        System.out.println(c4);
    }
}
