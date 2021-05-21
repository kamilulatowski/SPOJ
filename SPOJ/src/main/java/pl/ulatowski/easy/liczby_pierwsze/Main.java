package pl.ulatowski.easy.liczby_pierwsze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int n;

        do {
            n = scanner.nextInt();
        } while (n >= 100000 || n <= 0);

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number < 1 || number > 10000) {
                i--;
                continue;
            }
            numbers.add(number);
        }

        numbers.forEach(Main::isPrime);
    }

    private static void isPrime(int num) {
        boolean isTrue = true;
        if (num == 1) {
            System.out.println("NIE");
            return;
        } else if (num == 2) {
            System.out.println("TAK");
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(num) + 1; i++) {
                if (num % i == 0) {
                    isTrue = false;
                    break;
                }
            }
        }
        if (isTrue) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
