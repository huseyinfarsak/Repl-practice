package Repl_Practices;

import java.util.Scanner;

public class Party_Loop_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String totalList =" ";

        while(true){
            System.out.println("Please enter guest name:");
            String guestName = input.next();
            totalList += guestName+" ";

            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            if(answer.contains("no")){
                System.out.println("Guest's list:"+totalList.substring(0,totalList.length()-1));
                break;
            }
        }

    }
}
