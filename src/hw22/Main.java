package hw22;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Введіть радіус кола.");
        float r = num.nextFloat();
        float d = r + r;
        double p = 2 * Math.PI * r;
        double s = Math.PI * Math.pow(r, 2);

        System.out.println("Діаметр кола = " + d + ", периметр кола = " + p + ", площа кола = " + s + ".");
    }
}
