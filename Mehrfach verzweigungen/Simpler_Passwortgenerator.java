import java.util.Random;

public class Simpler_Passwortgenerator {
    public static void main(String[] args) {
        Random rand = new Random();

        // 1) 100 Zufallszahlen zwischen 0.0 und 1.0 erzeugen und ausgeben
        double[] randomNumbers = new double[100];
        System.out.println("100 Zufallszahlen zwischen 0.0 und 1.0:");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = Math.random(); // Werte zwischen 0.0 (inkl.) und 1.0 (exkl.)
            System.out.println(randomNumbers[i]);
        }

        // 2) Eine Zufallszahl zwischen 0.0 und 5.0 erzeugen
        double randomDouble = Math.random() * 5; // Bereich [0.0, 5.0)
        System.out.println("\nZufallszahl zwischen 0.0 und 5.0: " + randomDouble);

        // 3) Zufallszahl zwischen 0 und 5 (nur ganze Zahlen)
        int randomInt = (int) (Math.random() * 6); // 0 bis 5 inkl.
        System.out.println("\nGanzzahlige Zufallszahl zwischen 0 und 5: " + randomInt);

        // 4) Zufallszahl im Bereich [min, max]
        int min = 10;
        int max = 20;
        int randomInRange = min + rand.nextInt(max - min + 1);
        System.out.println("\nZufallszahl im Bereich von " + min + " bis " + max + ": " + randomInRange);

        // 5) Zufallszahl zwischen 65 und 90 generieren und als ASCII-Zeichen ausgeben
        int asciiMin = 65; // A
        int asciiMax = 90; // Z
        int randomAscii = asciiMin + rand.nextInt(asciiMax - asciiMin + 1);
        System.out.println("\nGenerierte Zufallszahl: " + randomAscii);
        System.out.println("Entsprechendes ASCII-Zeichen: " + (char) randomAscii);
    }
}