package models.batiments;

public class Atelier extends Batiment {

    private static final int PRODUCTION_OUTILS = 1;
    private static final double PRODUCTION_ARMES = 0.5;

    private int outilsStockee;
    private int armesStockee;
    private double armesEnCours;
    private double bonusProductionGlobal;

    public Atelier() {
        super("Atelier", 25, 20, 5, 3);
        this.outilsStockee = 0;
        this.armesStockee = 0;
        this.armesEnCours = 0.0;
        this.bonusProductionGlobal = 0.0;

    }
    /*
    public int calculerProductionOutils() {
        return (int) (PRODUCTION_ARMES * villageoisAffectes * getMultiplicateur());
    }

    public void appliquerEffet(){
        if (villageoisAffectes == 0) {
            System.out.println("[" +nom+ "niv. " +niveau+ "] Aucun artisant affectés !" );
            return;
        }
        int outils = calculerProductionOutils();
        outilsStockee += outils;

        armesEnCours += PRODUCTION_ARMES * villageoisAffectes * getMultiplicateur());
        int armesProduites =(int) armesEnCours;
        armesEnCours -= armesProduites;
        armesStockee += armesProduites;

        bonusProductionGlobal = Math.min(0.5, outilsStockee * 0.005);
        System.out.println("[" +nom+ "niv. " +niveau+ "] Produit " + outils + "outils et "
                            +armesProduites+ "arme(s). Bonus global : +" +(int) (bonusProductionGlobal * 100) + "%");

    }*/



}
