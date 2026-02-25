package models.batiments;

public class Mine extends Batiment{

    private static final int PROD_PIERRE_BASE = 3;
    private static final int PROD_FER_BASE    = 2;

    private int pierreStockee;
    private int ferStocke;

    public Mine() {
        super("Mine", 15, 40, 5, 4,0,1,10,1); // 4 villageois max
        this.pierreStockee = 0;
        this.ferStocke     = 0;
    }
/*
    public int calculerProductionPierre() {
        return (int) (PROD_PIERRE_BASE * villageoiseAffectes * getMultiplicateur());
    }

    public int calculerProductionFer() {
        return (int) (PROD_FER_BASE * villageoiseAffectes * getMultiplicateur());
    }

    @Override
    public void appliquerEffet() {
        if (villageoiseAffectes == 0) {
            System.out.println("[" + nom + " niv." + niveau + "] Aucun villageois affecté, pas de production.");
            return;
        }
        int pierre = calculerProductionPierre();
        int fer    = calculerProductionFer();
        pierreStockee += pierre;
        ferStocke     += fer;
        System.out.println("[" + nom + " niv." + niveau + "] Extrait " + pierre
                + " Pierre et " + fer + " Fer (x" + String.format("%.1f", getMultiplicateur()) + ").");
    }
    public int[] recolter() {
        int[] ressources = {pierreStockee, ferStocke};
        pierreStockee = 0;
        ferStocke     = 0;
        return ressources;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("  Prod. Pierre   : " + calculerProductionPierre() + "/tour");
        System.out.println("  Prod. Fer      : " + calculerProductionFer() + "/tour");
        System.out.println("  Stock Pierre   : " + pierreStockee);
        System.out.println("  Stock Fer      : " + ferStocke);
    }

    public int getPierreStockee() { return pierreStockee; }
    public int getFerStocke()     { return ferStocke; }
}*/

}
