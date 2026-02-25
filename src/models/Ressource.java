package models;

import models.batiments.Maison;
import models.unites.Villageois;

import java.util.List;

public class Ressource {

    private int bois;
    private int pierre;
    private int nourriture;
    private int fer;
    private int or;


    public Ressource() {
    }

    public Ressource(int bois, int pierre, int nourriture, int fer, int or) {
        this.bois = bois;
        this.pierre = pierre;
        this.nourriture = nourriture;
        this.fer = fer;
        this.or = or;

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

    public void colecterBois(int bois){
        this.bois += bois;
    }

    public void collecterPierre(int pierre){
        this.pierre += pierre;
    }

    public void collecterFer(int fer){
        this.fer += fer;
    }

    public void collecterNourriture(int nourriture){
        this.nourriture += nourriture;
    }


}
