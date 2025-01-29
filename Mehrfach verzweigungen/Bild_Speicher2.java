import java.util.Scanner;

public class Bild_Speicher2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        // Daten werden Abgefragt
        System.out.println(".(Gebe die Höhe des Bildes ein)");
        double Höhe = s.nextDouble();

        System.out.println("Gebe die Breite des Bildes ein");
        double Breite = s.nextDouble();

        System.out.println("Um welchen Format handelt es sich? RGB oder Graustufen?");
        String Format = s.next();

        double Pixel_speicher = 0;

        switch (Format) {
            case "RGB":
                Pixel_speicher = 3;
                System.out.println("Das RGB Format wurde ausgewählt. ");
                break;

            case "Graustufen":
                Pixel_speicher = 1;
                System.out.println("Das Format Graustufen wurde ausgewählt.");
                break;

            default:
                Pixel_speicher = 3;
                System.out.println("Ungültige Eingabe! Als Standart wurde das RGB Format gewählt.");
                break;
        }

        System.out.println("Gebe die Anzahl der Bilder ein");
        double Bild_Anzahl = s.nextDouble();

        // Berechnungen
        double Speicherbedarf_pro_Bild = Höhe * Breite * Pixel_speicher;

        double Gesamt_Speicher = Speicherbedarf_pro_Bild * Bild_Anzahl;

        double Speicherbedarf_in_GiB = Gesamt_Speicher / (1024 * 1024 * 1024);

        System.out.println("Der Speicher für " + Bild_Anzahl + " Bilder beträgt " + Speicherbedarf_in_GiB + " GiB");

        s.close();

    }

}
