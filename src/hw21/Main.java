package hw21;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Введіть значення а.");
        double a = num.nextDouble();
        System.out.println("Введіть значення b.");
        double b = num.nextDouble();
        System.out.println("Введіть значення c.");
        double c = num.nextDouble();
        double d = pow(b, 2) - 4 * a * c;

        System.out.println("Дискремінант рівний" + d + ".");
    }
}
