package pl.ulatowski.easy.dwie_cyfry_silni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int D, n, factorial, digit, decimal;

        do {
            D = scanner.nextInt();
        } while (D < 1 || D > 30);

        for (int i = 0; i < D; i++) {
            do {
                n = scanner.nextInt();
            } while (n < 0 || n > 1000000000);
            list.add(n);
        }

        for (int i : list) {
            if (i > 9) {
                System.out.println(0 + " " + 0);
            } else {
                factorial = factorial(i);
                digit = factorial % 10;
                factorial /= 10;
                decimal = factorial % 10;
                System.out.printf("%d %d\n", decimal, digit);
            }
        }
    }

    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}

