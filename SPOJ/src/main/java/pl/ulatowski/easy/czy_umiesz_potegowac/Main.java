package pl.ulatowski.easy.czy_umiesz_potegowac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int D, a, b;
        List<Integer> numberList = new ArrayList<>();

        do {
            D = scanner.nextInt();
        } while (D < 1 || D > 10);

        for (int i = 0; i < D; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a < 1 || b < 1 || a > 1000000000 || b > 1000000000) {
                i--;
                continue;
            }
            numberList.add(a);
            numberList.add(b);
        }

        for (int i = 0; i < numberList.size() - 1; i += 2) {
            System.out.println(getLastDigit(numberList.get(i), numberList.get(i + 1)));
        }
    }

    private static int getLastDigit(int a, int b) {
        int result;
        if (a == 1) {
            return 1;
        }
        a %= 10;
        switch (a) {
            case 2:
            case 3:
            case 7:
            case 8:
                b %= 4;
                break;
            case 4:
            case 9:
                b %= 2;
                break;
            case 5:
            case 6:
            case 0:
                b = 1;
                break;
        }
        if (b == 0) {
            switch (a) {
                case 2:
                case 3:
                case 7:
                case 8:
                    b = 4;
                    break;
                case 4:
                case 9:
                    b = 2;
                    break;
            }
        }
        result = (int) Math.pow(a, b);
        result %= 10;
        return result;
    }
}
