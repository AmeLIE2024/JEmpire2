package models.batiments;

public class Maison extends Batiment {


    private int capacitePopulation;

    public Maison() {
        super("Maison", 20, 10, 0, 0,1);
       // this.capaciteMaxVillageois = 0;
        this.capacitePopulation = 1;
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
