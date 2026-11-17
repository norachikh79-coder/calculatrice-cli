package dz.univ.calculatrice;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final Operation addition = new AddOperation();
        final Operation soustraction = new SubtractOperation();

        System.out.println("=== CALCULATRICE CLI ===");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.print("Choisissez une operation : ");

        final int choix = scanner.nextInt();

        System.out.print("Entrez le premier nombre : ");
        final double a = scanner.nextDouble();

        System.out.print("Entrez le deuxieme nombre : ");
        final double b = scanner.nextDouble();

        switch (choix) {
            case 1:
                System.out.println("Resultat : " + addition.calculer(a, b));
                break;
            case 2:
                System.out.println("Resultat : " + soustraction.calculer(a, b));
                break;
            default:
                System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}
