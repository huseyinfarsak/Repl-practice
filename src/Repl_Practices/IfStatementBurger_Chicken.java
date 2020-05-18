package Repl_Practices;

import java.util.Scanner;

public class IfStatementBurger_Chicken {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your word");


        String in = s.next();
        double price = 10.0;
        double price1 = 2.0;

        if(in.equals("burger")|| in.equals("chicken")){
            System.out.println(price);
        }if (in.equals("soda")){
            System.out.println(price1);
        }

    }
}
