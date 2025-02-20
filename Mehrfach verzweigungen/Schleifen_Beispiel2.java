public class Schleifen_Beispiel2 {
    public static void main(String[] args) {
        int summe = 0;
        
        // Zählschleife von 1 bis 100
        for (int x = 1; x <= 100; x++) {
            summe += x; // Summe = Summe + x
        }
        
        // Ausgabe der berechneten Summe
        System.out.println("Die Summe aller Zahlen von 1 bis 100 ist: " + summe);

    }

}