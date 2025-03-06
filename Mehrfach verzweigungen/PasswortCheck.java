import java.util.Scanner;

public class PasswortCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwort;
        int versuche = 3;
        
        do {
            System.out.print("Bitte geben Sie ein Passwort ein: ");
            passwort = scanner.nextLine();
            
            if (passwort.length() >= 10) {
                System.out.println("Passwortlänge OK");
                break;
            } else {
                System.out.println("Passwort muss mind. 10 Zeichen haben.");
                versuche--;
                if (versuche > 0) {
                    System.out.println("Versuche übrig: " + versuche);
                } else {
                    System.out.println("Maximale Anzahl an Versuchen erreicht.");
                }
            }
        } while (versuche > 0);
        
        scanner.close();
    }
}
