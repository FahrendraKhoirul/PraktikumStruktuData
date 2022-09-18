package Bantutemen;

import java.util.Scanner;

public class AppStackPalindrom1 {

    public static void main(String[] args) {
        String input, output;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter String: ");
            input = in.nextLine();
            if (input.equals("")) {
                break;
            }

            Pembalik pembalik = new Pembalik(input);
           
            output =  pembalik.balik();
            System.out.println("Dibalik jadi: " + output);

            if (input.equals(output)) {
                System.out.println("kata " + input + " adalah kata polindrome");
                System.out.println(" ");
            } else {
                System.out.println("kata " + input + " bukan kata polindrome");
                System.out.println(" ");
            }
        }
    }

}
