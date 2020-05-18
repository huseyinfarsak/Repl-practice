package Interview_Questions;

import java.util.Scanner;

public class String_MiddleCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = input.next();

    if (word.length()%2==0){
        System.out.println(""+(word.charAt(word.length()/2-1))+word.charAt(word.length()/2));

    }else{
        System.out.println(""+word.charAt(word.length()/2));
    }

    }
}
