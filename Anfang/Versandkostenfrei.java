package Anfang;

import java.util.Scanner;

public class Versandkostenfrei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Bestellwert in Euro ein: ");
        double bestellwert = scanner.nextDouble();
        double porto;

        if (bestellwert >= 200) {
            porto = 0.00;
        } else {
            porto = 5.50;
        }
        double rechnungsbetrag = bestellwert + porto;

        System.out.print("Der Rechungsbetrag beträgt " + rechnungsbetrag + " Euro");

        scanner.close();

    }

}
