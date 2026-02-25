package models.batiments;

import models.Ressource;

public class Maison extends Batiment {


    private int capacitePopulation;

    static int coutBois = 20;
    static int coutNourriture = 1;


    public Maison() {
        super("Maison", 1, 10, 0, 0,1, 1, 10, 1);
       // this.capaciteMaxVillageois = 0;
        //this.capacitePopulation = 1;
    }

    public static Batiment constructBatiment(Ressource ressource){
        if(ressource.getBois() < coutBois) {
            System.err.println("Pas assew de bois");
            return null;
        } else if (ressource.getNourriture() > coutNourriture) {
            System.err.println("Pas assew de nourriture");
            return null;
        }
        Maison maison = new Maison();
        ressource.collecterNourriture(-coutNourriture);
        ressource.colecterBois(-coutBois);

        return maison;
    }

/*
    public int getCapacitePopulation() {
        return niveau;
    }
    @Override
    public boolean ameliorer();{

        boolean ok = super.ameliorer();
        if(ok){
            capacitePopulation = niveau;
            System.out.println(" -> Capacité d'accueil : " + capacitePopulation + "habitant(s).");
        }
        return ok;

    }
    @Override    public void appliquerEffet(){
        System.out.println("[" +nom+ " niv." + niveau+ "] Abrite" + getCapacitePopulation()
                + " habitant(s). (Effet passif)");
    }
    @Override
    public void afficherDetails(){
        super.afficherDetails();
        System.out.println(" Capacité pop. :" +getCapacitePopulation() + " habitant(s)");

    }*/
}
