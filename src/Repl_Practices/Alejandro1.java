package Repl_Practices;

import java.util.Scanner;

public class Alejandro1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your email");
        String a = input.nextLine();

        if (a.contains("Huseyin")) {
            System.out.println("You have an email");
        } else {
            System.out.println("It's junk email");
        }

    }
}
