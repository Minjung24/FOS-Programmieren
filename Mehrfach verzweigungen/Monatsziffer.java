import java.util.Scanner;

public class Monatsziffer {

    public static void main(String[] args) {

        // Scanner für Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        // Eingabe Benutzer
        System.out.println("Welchen Monat haben wir?");
        int n = scanner.nextInt(); // Benutzereingabe für den Monat

        // Switch-Anweisung zur Ermittlung des Monats
        switch (n) {
            case 1 -> System.out.println("Es ist Januar");

            case 2 -> System.out.println("Es ist Februar");

            case 3 -> System.out.println("Es ist März");

            case 4 -> System.out.println("Es ist April");

            case 5 -> System.out.println("Es ist Mai");

            case 6 -> System.out.println("Es ist Juni");

            case 7 -> System.out.println("Es ist Juli");

            case 8 -> System.out.println("Es ist August");

            case 9 -> System.out.println("Es ist September");

            case 10 -> System.out.println("Es ist Oktober");

            case 11 -> System.out.println("Es ist November");

            case 12 -> System.out.println("Es ist Dezember");

            default -> System.out.println("Kein Monat im Kalender");
        }

        // Scanner schließen
        scanner.close();
    }
}
