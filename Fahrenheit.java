import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("Was ist die Temperatur in Fahrenheit?");
        double Fahrenheit = s.nextDouble();
        double Celsius = (Fahrenheit -32) * 5/9;
        System.out.println(Celsius);
    }

}
