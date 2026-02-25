package models.batiments;

public class Ferme extends Batiment {

    private static final int PRODUCTION_BASE = 5;
    private int nourritureStockee;

    public Ferme() {
        super("Ferme", 30, 5, 0, 5);
        this.nourritureStockee = 0;
    }
//
//    public int calculerProduction() {
//        return (int) (PRODUCTION_BASE * villageoisAffectes * getMultiplicateur());
//    }
//
//    public void appliquerEffet() {
//        int prod = calculerProduction();
//        nourritureStockee += prod;
//        if (villageoisAffectes = 0) {
//            System.out.println("[" + nom + "niv." + niveau + "] Aucun villageois affetcé, pas de production.");
//
//        } else {
//            System.out.println("[" + nom + "niv." + niveau + "] Produit" + prod + " nourriture (x"
//                    + String.format("%1f", getMultiplicateur()) + ")."
//                    + " Stock local : " + nourritureStockee);
//        }
//    }
//
//    public int recolter() {
//        int recolte = nourritureStockee;
//        nourritureStockee = 0;
//        return recolte;
//    }
//
//    public void afficherDetails() {
//        super.afficherDetails();
//        System.out.println("  Prod. base     : " + PRODUCTION_BASE + " nourr./villageois/tour");
//        System.out.println("  Prod. actuelle : " + calculerProduction() + " nourr./tour");
//        System.out.println("  Stock local    : " + nourritureStockee);
//    }
//
//    public int getNourritureStockee() {
//        return nourritureStockee;
//    }
}


