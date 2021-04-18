package hw5;

import java.util.Scanner;

class Calculate {


    void rectangle() {

        Scanner num = new Scanner(System.in);

        System.out.println("Введіть довжину прямокутника.");
        double a = num.nextDouble();
        System.out.println("Введіть ширину прямокутника.");
        double b = num.nextDouble();


        double permtrRectangle = (a + b) * 2;
        double plochaRectangle = a * b;

        System.out.println("Периметр прямокутника = " + permtrRectangle + ", площа прямокутника = " + plochaRectangle + ".");
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.rectangle();
        calculate.circle();
    }


    void circle() {


        Scanner num = new Scanner(System.in);

        System.out.println("Введіть радіус кола.");
        double radius = num.nextDouble();

        double diamtr = 2 * radius;
        double permtrCircle = 2 * Math.PI * radius;
        double plochaCircle = Math.PI * radius * radius;

        System.out.println("Діаметр кола = " + diamtr + ", периметр кола = " + permtrCircle + " , площа кола =" + plochaCircle + ".");
    }

}


