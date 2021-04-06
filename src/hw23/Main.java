package hw23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int count = 0;
        System.out.println("Введіть 10 чисел.");

        while (count <= 10){
            int var = scanner.nextInt();

            if (var <0){
                negative++;
            } else if (var < 0){
                positive++;
            } else if (var > 0){
                positive++;
            } else {
                zero++;
            }
            count++;
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
