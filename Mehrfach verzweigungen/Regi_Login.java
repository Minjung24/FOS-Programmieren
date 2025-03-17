import java.util.Random;
import java.util.Scanner;

public class Regi_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registrierung
        System.out.println(" ***Registrierung*** ");
        System.out.println("Geben Sie einen Benutzernamen zum Registrieren ein:");
        String Benutzer = scanner.nextLine();

        System.out.println("Wählen Sie eine Option:");
        System.out.println("1 - Eigenes Passwort eingeben");
        System.out.println("2 - Zufälliges Passwort generieren");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Scanner-Puffer leeren

        String password = "";
        switch (choice) {
            case 1:
                password = validateUserPassword(scanner);
                break;
            case 2:
                password = generateRandomPassword();
                System.out.println("Generiertes Passwort: " + password);
                break;
            default:
                System.out.println("Ungültige Auswahl!");
                return;
        }

        // Login-Prozess starten
        loginUser(scanner, Benutzer, password);

        scanner.close();
    }

    // Methode zur Überprüfung eines eigenen Passworts
    public static String validateUserPassword(Scanner scanner) {
        System.out.println("Geben Sie Ihr Passwort ein (mind. 7 Buchstaben, 2 Zahlen, 2 Sonderzeichen):");
        String password = scanner.nextLine();

        while (!isValidPassword(password)) {
            System.out.println("Passwort ungültig! Es muss mindestens 7 Buchstaben, 2 Zahlen und 2 Sonderzeichen enthalten.");
            System.out.println("Bitte erneut eingeben:");
            password = scanner.nextLine();
        }

        System.out.println("Passwort erfolgreich gesetzt!");
        return password;
    }

    // Methode zur Generierung eines zufälligen Passworts
    public static String generateRandomPassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // 7 zufällige Buchstaben (groß & klein)
        for (int i = 0; i < 7; i++) {
            password.append(getRandomLetter(random));
        }
        // 2 zufällige Zahlen
        for (int i = 0; i < 2; i++) {
            password.append(getRandomNumber(random));
        }
        // 2 zufällige Sonderzeichen
        for (int i = 0; i < 2; i++) {
            password.append(getRandomSpecialChar(random));
        }

        return shuffleString(password.toString());
    }

    // Passwortvalidierung
    public static boolean isValidPassword(String password) {
        return password.matches("(?=.*[a-zA-Z]{7,})(?=.*\\d{2,})(?=.*[!@#$%^&*()_+\\-=]{2,}).{11,}");
    }

    // Zufällige Buchstaben (A-Z, a-z)
    public static char getRandomLetter(Random random) {
        return (char) (random.nextBoolean() ? 'A' + random.nextInt(26) : 'a' + random.nextInt(26));
    }

    // Zufällige Zahlen (0-9)
    public static char getRandomNumber(Random random) {
        return (char) ('0' + random.nextInt(10));
    }

    // Zufällige Sonderzeichen
    public static char getRandomSpecialChar(Random random) {
        String specialChars = "!@#$%^&*()_+-=";
        return specialChars.charAt(random.nextInt(specialChars.length()));
    }

    // Methode zum Mischen eines Strings (verhindert vorhersehbare Reihenfolge)
    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }

    // Methode für den Login-Prozess
    public static void loginUser(Scanner scanner, String USERNAME, String PASSWORD) {
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print(" ***Login*** ");
            System.out.print("Benutzername: ");
            String inputUser = scanner.nextLine();

            System.out.print("Passwort: ");
            String inputPass = scanner.nextLine();

            if (inputUser.equals(USERNAME) && inputPass.equals(PASSWORD)) {
                System.out.println("Login ok. Willkommen!");
                return;
            } else {
                attempts++;
                System.out.println("Falsche Anmeldedaten. Verbleibende Versuche: " + (MAX_ATTEMPTS - attempts));
            }
        }

        System.out.println("Maximale Anzahl an Versuchen erreicht. Zugang gesperrt!");
    }
}