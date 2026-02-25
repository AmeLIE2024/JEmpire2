import models.Menu;
import models.Ressource;
import models.batiments.Maison;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ressource ressourceJoueur = new Ressource(50, 50, 100, 10, 50);
        Maison maisonDepart = new Maison();
        Scanner scanner = new Scanner(System.in);


        System.out.println("JEmpire V02");
        int jour = 0;
        while (jour == jour){
            System.out.println("\nJour " + jour + "\n");
            System.out.println("Vos ressources : \n");
            System.out.println(
                    " | Bois : " + ressourceJoueur.getBois() +
                            " | Pierre : " + ressourceJoueur.getPierre() +
                            " | Or : " + ressourceJoueur.getOr() +
                            " | Nourriture : " + ressourceJoueur.getNourriture() +
                            " | Fer : " + ressourceJoueur.getFer() +
                            " | Maison: "  +
                            " |");
            Menu.menu(ressourceJoueur, scanner, maisonDepart);
        }
        jour++;

    }



}