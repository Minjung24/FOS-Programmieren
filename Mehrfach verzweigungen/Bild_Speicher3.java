import java.util.Scanner;

public class Bild_Speicher3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        // Daten werden Abgefragt
        System.out.println(".(Gebe die Höhe des Bildes ein)");
        double Höhe = s.nextDouble();

        System.out.println("Gebe die Breite des Bildes ein");
        double Breite = s.nextDouble();

        double Pixel_speicher = 0; 
        boolean validInput = false;

        while (!validInput) { 
            System.out.println("Um welches Format handelt es sich? (RGB, Graustufen, CMYK, Schwarz/Weiß)");
            String Format = s.next().toLowerCase(); // Kleinbuchstaben für bessere Vergleichbarkeit

            switch (Format) {
                case "rgb":
                    Pixel_speicher = 3;
                    System.out.println("Das RGB-Format wurde ausgewählt.");
                    validInput = true;
                    break;

                case "graustufen":
                    Pixel_speicher = 1;
                    System.out.println("Das Graustufen-Format wurde ausgewählt.");
                    validInput = true;
                    break;

                case "cmyk":
                    Pixel_speicher = 8;
                    System.out.println("Das CMYK-Format wurde ausgewählt.");
                    validInput = true;
                    break;

                case "schwarz/weiß":
                    Pixel_speicher = 0.125;
                    System.out.println("Das Schwarz-Weiß-Format wurde ausgewählt.");
                    validInput = true;
                    break;

                default:
                    System.out.println("Ungültige Eingabe! Bitte versuchen Sie es erneut.");
            }   
        }

        System.out.println("Gebe die Anzahl der Bilder ein");
        double Bild_Anzahl = s.nextDouble();

        
        double Speicherbedarf_pro_Bild = Höhe * Breite * Pixel_speicher;

        double Gesamt_Speicher = Speicherbedarf_pro_Bild * Bild_Anzahl;

        double Speicherbedarf_in_GiB = Gesamt_Speicher / (1024 * 1024 * 1024);

        System.out.println("Der Speicher für " + Bild_Anzahl + " Bilder beträgt " + Speicherbedarf_in_GiB + " GiB");

        s.close();

    }

}
