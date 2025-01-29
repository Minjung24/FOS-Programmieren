package Anfang;

import java.util.Scanner;

public class Rabattrechner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Geben Sie Ihren Umsatz in Euro ein ");

            double Umsatz = scanner.nextDouble();
            double Rabatt;

            if (Umsatz >= 500) {
                Rabatt = 10.00;
            } else {
                if (Umsatz >= 100) {
                    Rabatt = 5.00;
                } else {
                    Rabatt = 0.00;
                }

                double Betrag = Umsatz - Umsatz / 100 * Rabatt;

                System.out.print("Der Betrag beträgt " + Betrag + " Euro");

            }
        }

    }
}