package models;

import models.unites.Villageois;

import java.util.List;

public class Ressource {

    private int bois;
    private int pierre;
    private int nourriture;
    private int fer;
    private int or;
    List<Villageois> population;


    public Ressource() {
    }

    public Ressource(int bois, int pierre, int nourriture, int fer, int or, List<Villageois> population) {
        this.bois = bois;
        this.pierre = pierre;
        this.nourriture = nourriture;
        this.fer = fer;
        this.or = or;
        this.population = population;
    }

    public int getBois() {
        return bois;
    }

    public int getPierre() {
        return pierre;
    }

    public int getNourriture() {
        return nourriture;
    }

    public int getFer() {
        return fer;
    }

    public int getOr() {
        return or;
    }

    public List<Villageois> getPopulation() {
        return population;
    }
}
