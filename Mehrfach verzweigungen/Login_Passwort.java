import java.util.Scanner;

public class Login_Passwort {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "Passwort123"; // Das richtige Passwort
        String inputPassword;
        int attempts = 0;
        final int maxAttempts = 3;

        do {
            System.out.print("Bitte geben Sie Ihr Passwort ein: ");
            inputPassword = sc.nextLine();
            attempts++;

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Login erfolgreich!");
                break;
            } else {
                System.out.println("Falsches Passwort. Versuchen Sie es erneut.");
            }
        } while (attempts < maxAttempts);

        if (attempts == maxAttempts) {
            System.out.println("Maximale Anzahl von Versuchen erreicht. Zugriff verweigert.");
        }

        sc.close();
    }
}