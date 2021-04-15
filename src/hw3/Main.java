package hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write your sentence here:");
        String sentence = reader.nextLine();

        int length;

        String[] split = sentence.split(" ");

        for (String letter1 : split) {
            System.out.println(letter1 + " - " + letter1.charAt(0) + " - " +  letter1.length( ));
        }


    }
}
