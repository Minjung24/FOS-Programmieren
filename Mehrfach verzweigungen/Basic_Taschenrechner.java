import java.util.Scanner;

public class Basic_Taschenrechner {

    public static void main(String[] args) {
        // Scanner für Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        // Eingabe des ersten Operanden
        System.out.println("Geben Sie den ersten Operanden ein:");
        double operand1 = scanner.nextDouble();

        // Eingabe des Operators
        System.out.println("Geben Sie den Operator ein (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        // Eingabe des zweiten Operanden
        System.out.println("Geben Sie den zweiten Operanden ein:");
        double operand2 = scanner.nextDouble();

        // Variable für das Ergebnis
        double result;

        // Berechnung basierend auf dem Operator
        switch (operator) {
            case '+' -> {
                result = operand1 + operand2;
                System.out.println("Ergebnis: " + result);
            }

            case '-' -> {
                result = operand1 - operand2;
                System.out.println("Ergebnis: " + result);
            }

            case '*' -> {
                result = operand1 * operand2;
                System.out.println("Ergebnis: " + result);
            }

            case '/' -> {
                // Prüfe Division durch Null
                if (operand2 == 0) {
                    System.out.println("Fehler: Division durch 0 ist nicht erlaubt!");
                } else {
                    result = operand1 / operand2;
                    System.out.println("Ergebnis: " + result);
                }
            }

            default -> // Ungültiger Operator
                System.out.println("Ungültiger Operator! Bitte +, -, * oder / verwenden.");
        }

        // Scanner schließen
        scanner.close();
    }
}
