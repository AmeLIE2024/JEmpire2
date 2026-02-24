import models.Ressource;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ressource ressourceJoueur = new Ressource(0, 0, 100, 0, 50, List.of());
        Scanner scanner = new Scanner(System.in);
        System.out.println("JEmpire V02");
        int jour = 0;
        System.out.println("\nJour " + jour + "\n");
        System.out.println("Vos ressources : \n");
        System.out.println(
                "+--------------------------------------------------------------+");
        System.out.println(
                " | Bois : " + ressourceJoueur.getBois() +
                        " | Pierre : " + ressourceJoueur.getPierre() +
                        " | Or : " + ressourceJoueur.getOr() +
                        " | Nourriture : " + ressourceJoueur.getNourriture() +
                        " | Fer : " + ressourceJoueur.getFer() +
                        " | Population : " + ressourceJoueur.getPopulation() +
                        " |");
        System.out.println(
                "+--------------------------------------------------------------+");
        menu(ressourceJoueur, scanner);

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

                    isValid = true;
                    break;
                case 2:
                    isValid = true;
                    break;
                default:
                    break;
            }
        } while (!isValid);
    }

}