import java.util.Random;

public class Wuerfelstatisktik {

    public static void main(String[] args) {

Random zufall = new Random();
        int sechser = 0;   
             
        for (int i = 1; i <= 6000; i++) {
        int augen = (int)(Math.random()*6)+1;

        if (augen == 6) {
            sechser++;
        }
    }

    // Ausgabe der Anzahl der geworfenen Sechsen
    System.out.println("Anzahl der geworfenen Sechsen: " + sechser);

    }
}
