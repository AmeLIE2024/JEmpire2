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
            menu(ressourceJoueur, scanner);
        }
        jour++;

    }

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
                "+-------+----------------------------------+");

        int choiceCollecte = readInt(scanner);
        switch (choiceCollecte) {
            case 1:
                ressourceJoueur.collecterNourriture(5);
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
            default:
                return false;
        }
        return true;
    }

    public static void menu(Ressource ressourceJoueur, Scanner scanner) {

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
                    "|   1   | Collecter des ressources |");
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
                    isValid = menuConstruire(scanner, ressourceJoueur);
                    break;
                default:
                    break;
            }
        } while (!isValid);
    }

    private static boolean menuConstruire(Scanner scanner, Ressource ressourceJoueur) {

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
                //TODO ajouter coût de construction maison
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