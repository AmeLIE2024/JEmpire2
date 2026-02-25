package models;


import models.batiments.Maison;

import java.util.Scanner;

public class Menu {
    public static int readInt(Scanner scanner) {
        System.out.print("Entrez un nombre: ");
        String input;
        boolean isValid = false;
        int result = 0;
        do {
            input = scanner.nextLine();
            try {
                result = Integer.parseInt(input);
                isValid = true;
            } catch (Exception e) {
                System.err.print("Entrez un nombre valide: ");
            }
        } while (!isValid);

        return result;
    }

    public static boolean menuCollecter(Scanner scanner, Ressource ressourceJoueur){

        System.out.println("\nAffectation du villageois : \n");
        System.out.println(
                "+-------+----------------------------------+");
        System.out.println(
                "| Choix | Action                           |");
        System.out.println(
                "+-------+----------------------------------+");
        System.out.println(
                "|   1   | Ferme (+5 nourritures)           |");
        System.out.println(
                "|   2   | Mine(+3 pierres et/ou +2 fer)    |");
        System.out.println(
                "|   3   | Maison(-10 pierres, -20 bois     |");
        System.out.println(
                "|   4   | Forêt +10 bois + 1 nourriture    |");
        System.out.println(
                "+-------+----------------------------------+");

        int choiceCollecte = readInt(scanner);
        switch (choiceCollecte) {
            case 1:
//                ressourceJoueur.collecterNourriture(5);


                break;
            case 2:
                if (Math.random() < 0.7){
                    System.out.println("Collecte de Pierre");
                    ressourceJoueur.collecterPierre(3);
                }
                if(Math.random() < 0.5){
                    System.out.println("Collecte de Fer");
                    ressourceJoueur.collecterFer(2);
                }
                break;
            case 3:


                break;
            case 4:

                break;
            default:
                return false;
        }
        return true;
    }

    public static void menu(Ressource ressourceJoueur, Scanner scanner,Maison maisonDepart ) {

        boolean isValid = false;
        do {
            System.out.println("\nQue souhaitez vous faire : \n");
            System.out.println(
                    "+-------+--------------------------+");
            System.out.println(
                    "| Choix | Action                   |");
            System.out.println(
                    "+-------+--------------------------+");
            System.out.println(
                    "|   1   | Affecter un villageois   |");
            System.out.println(
                    "|   2   | Construire un bâtiment   |");
            System.out.println(
                    "+-------+--------------------------+");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    isValid = menuCollecter(scanner, ressourceJoueur);
                    break;
                case 2:
                    isValid = menuConstruire(scanner, ressourceJoueur, maisonDepart);
                    break;
                default:
                    break;
            }
        } while (!isValid);
    }

    private static boolean menuConstruire(Scanner scanner, Ressource ressourceJoueur, Maison maisonDepart) {

        System.out.println(
                "+-------+------------------+");
        System.out.println(
                "| Choix | Action           |");
        System.out.println(
                "+-------+------------------+");
        System.out.println(
                "|   1   | Maison           |");
        System.out.println(
                "|   2   | Caserne          |");
        System.out.println(
                "|   3   | Ferme            |");
        System.out.println(
                "|   4   | Mine             |");
        System.out.println(
                "|   5   | Atelier          |");
        System.out.println(
                "|   6   | Mur de défense   |");
        System.out.println(
                "+-------+------------------+");

        int choiceBatiment = readInt(scanner);
        switch (choiceBatiment) {
            case 1:
                if (ressourceJoueur.getBois() <= 20 || ressourceJoueur.getPierre() <= 10  || ressourceJoueur.getNourriture()< 1){
                    System.out.println("Vous n'avez pas assez de ressources");
                }else{
                    maisonDepart;
                    System.out.println("vous venez de contruire une maison");
                }
                break;
            case 2:
                //TODO ajouter coût de construction caserne
                break;
            case 3:
                //TODO ajouter coût de construction ferme
                break;
            case 4:
                //TODO ajouter coût de construction mine
                break;
            case 5:
                //TODO ajouter coût de construction atelier
                break;
            case 6:
                //TODO ajouter coût de construction mur de défense
                break;
            default:
                return false;
        }
        return true;
    }

}
