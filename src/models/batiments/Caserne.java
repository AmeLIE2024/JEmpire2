package models.batiments;

import java.util.List;

public class Caserne extends Batiment {


    private int tourRestantFormation;
    private int soldatEnFile;

    public Caserne() {
        super("Caserne", 40, 30, 10, 3,0,1,50,1);
        this.tourRestantFormation = 0;
        this.soldatEnFile = 0;
    }
    /* public int getTourRestantFormation() {
        return (niveau == 1) ? 2 : 1;

    }
    public int getSoldatParCycle(){
        if (niveau >= 10) return 5;
        if (niveau >= 5) return 0;
        return 1;
    }*/


}
