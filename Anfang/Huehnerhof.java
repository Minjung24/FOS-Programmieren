package Anfang;

import java.util.Scanner;

public class Huehnerhof {

    public static void main(String[] args) {
        // Scanner für Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        // Eingabe von Benutzer
        System.out.print("Geben Sie die Anzahl der Hühner (n) ein: ");
        int n = scanner.nextInt();

        System.out.print("Geben Sie die Anzahl der Tage (m) ein: ");
        int m = scanner.nextInt();

        // Konstanten
        double eierProHuhnProTag = 5.6 / 7; // Durchschnittliche Eier pro Tag
        double futterProHuhnProTag = 130.0; // Gramm Futter pro Tag

        // Berechnungen
        double gesamtEier = n * m * eierProHuhnProTag;
        double gesamtFutter = n * m * futterProHuhnProTag;

        // Ergebnisse ausgeben
        System.out.println("\nErgebnisse:");
        System.out.printf("Anzahl der gelegten Eier: %.2f%n", gesamtEier);
        System.out.printf("Benötigtes Futter: %.2f g (%.2f kg)%n", gesamtFutter, gesamtFutter / 1000);

        // Scanner schließen
        scanner.close();
    }
}
