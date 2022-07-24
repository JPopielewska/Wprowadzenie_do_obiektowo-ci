import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        int a;
        int b;
        a = 10;
        b = 2;
        int c;
        c = a - b;
        System.out.println(c);

        Kalkulator calc = new Kalkulator();
        System.out.println(calc.add(2,5));
         */
        Kalkulator calc = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondVariable = scanner.nextInt();
        System.out.println("Wynik to " + calc.add(firstVariable, secondVariable));
        System.out.println("Wynik to " + calc.sub(firstVariable, secondVariable));


    }


}
