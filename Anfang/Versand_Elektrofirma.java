package Anfang;

import java.util.Scanner;

public class Versand_Elektrofirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Was ist die Auftragssumme in Euro? ");
        double Bestellwert = scanner.nextDouble();

        double Versandkosten;

        if (Bestellwert >= 200) {
            Versandkosten = 0;
        } else {
            if (Bestellwert >= 100) {
                Versandkosten = 3.00;
            } else {
                Versandkosten = 5.50;
            }
        }

        double Rechung = Bestellwert + Versandkosten;

        System.out.print("Die Rechung Beträgt " + Rechung + " Euro");

        scanner.close();

    }
}
