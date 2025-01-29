import java.util.Scanner;


public class Bild_Speicher {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
        // Daten werden Abgefragt 
        System.out.println(".(Gebe die Höhe des Bildes ein)");
        double Höhe = s.nextDouble();

        System.out.println("Gebe die Breite des Bildes ein");
        double Breite = s.nextDouble();

        System.out.println("Gebe Speicherbedarf pro Pixel ein");
        double Pixel_Speicher = s.nextDouble();

        System.out.println("Gebe die Anzahl der Bilder ein");
        double Bild_Anzahl = s.nextDouble();

        //Berechnungen
        double Speicherbedarf_pro_Bild = Höhe*Breite*Pixel_Speicher;

        double Gesamt_Speicher = Speicherbedarf_pro_Bild*Bild_Anzahl;

        double Speicherbedarf_in_GiB = Gesamt_Speicher / (1024*1024*1024);

        System.out.println("Der Speicher für " + Bild_Anzahl + " Bilder beträgt " + Speicherbedarf_in_GiB + " GiB" );

    s.close();    
    


}

}
