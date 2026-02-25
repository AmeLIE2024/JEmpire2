import models.Menu;
import models.Ressource;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ressource ressourceJoueur = new Ressource(0, 0, 100, 0, 50, List.of());
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
                            " | Population : " + ressourceJoueur.getPopulation() +
                            " |");
            Menu.menu(ressourceJoueur, scanner);
        }
        jour++;

    }



}