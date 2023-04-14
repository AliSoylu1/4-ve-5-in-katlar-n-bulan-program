package Giriş;

import java.util.Scanner;

public class Böldürme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Bir sayı girin: ");
        n = input.nextInt();
        System.out.println("4 ün katları");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.print("\n5 in katları\n");
        for (int j = 1; j <= n; j *= 5) {
            System.out.print(j + " ");
        }
    }
}
