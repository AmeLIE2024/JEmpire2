package models.batiments;

import java.util.Scanner;

public class Batiment {


    private String nom;
    private int niveau;
    private int niveauMax = 10;
    private int coutBoisConstruction;
    private int coutpierreConstruction;
    private int coutOrConstruction;
    private int villageoisAffectes;
    private int capaciteMaxVillageois;


    public Batiment(String nom, int coutBois,int coutpierre, int coutOr, int capaciteMax) {
        this.nom = nom;
        this.niveau = 1;
        this.coutBoisConstruction = coutBois;
        this.coutpierreConstruction = coutpierre;
        this.coutOrConstruction = coutOr;
        this.capaciteMaxVillageois = capaciteMax;
        this.villageoisAffectes = 0;
    }
    /*
    public void appliquerEffet();


    public boolean ameliorer(){
        if (niveau >= niveauMax){
            System.out.println("[" +nom+ "] Niveau maximum (" +niveauMax+ ") déja atteint!");
            return false;
        }
        niveau++;
        System.out.println("[" +nom+ "] Amélioré au niveau (" +niveau+ ")  !");
        return true;
    }
    public double getMultiplicateur(){
        return 1.0+(niveau-1)* 0.1;
    }
    public boolean assignerVillageois() {
        if (villageoiseAffectes >= capaciteMaxVillageois) {
            System.out.println("[" + nom + "] Capacité maximale de villageois atteinte (" + capaciteMaxVillageois + ").");
            return false;
        }
        villageoiseAffectes++;
        return true;
    }
    public boolean retirerVillageois() {
        if (villageoiseAffectes <= 0) {
            System.out.println("[" + nom + "] Aucun villageois à retirer.");
            return false;
        }
        villageoiseAffectes--;
        return true;
    }
    @Override
    public String toString() {
        return String.format("%-20s | Niv. %2d/%d | Villageois: %d/%d",
                nom, niveau, niveauMax, villageoiseAffectes, capaciteMaxVillageois);
    }
    public void afficherDetails() {
        System.out.println("=== " + nom + " ===");
        System.out.println("  Niveau         : " + niveau + "/" + niveauMax);
        System.out.println("  Multiplicateur : x" + String.format("%.1f", getMultiplicateur()));
        System.out.println("  Villageois     : " + villageoiseAffectes + "/" + capaciteMaxVillageois);
        System.out.println("  Coût constr.   : " + coutBoisConstruction + " Bois | "
                + coutPierreConstruction + " Pierre | " + coutOrConstruction + " Or");
    }
    public String getNom() { return nom; }
    public int getNiveau() { return niveau; }
    public int getNiveauMax() { return niveauMax; }
    public int getCoutBois() { return coutBoisConstruction; }
    public int getCoutPierre() { return coutPierreConstruction; }
    public int getCoutOr() { return coutOrConstruction; }
    public int getVillageoiseAffectes() { return villageoiseAffectes; }
    public int getCapaciteMaxVillageois() { return capaciteMaxVillageois; }
}*/
}
