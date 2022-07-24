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
        int a = scanner.nextInt();
        System.out.println("Podaj operację + - * /");
        String znak = scanner.next();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        switch (znak) {
            case "+":
                System.out.println(calc.add(a,b));
        }


    }


}
