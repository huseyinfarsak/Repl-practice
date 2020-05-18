package Repl_Practices;

import java.util.Scanner;

public class WithoutX_x_075 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();

        String str = "";

        if(word.toLowerCase().startsWith("x")&& word.toLowerCase().endsWith("x")){
            str = word.substring(1,word.length()-1);
        }else if(word.toLowerCase().startsWith("x")){
            str = word.substring(1);
        }else if(word.toLowerCase().endsWith("x")){
            str = word.substring(0,word.length()-1);
        }else{
            str =word;
        }
        System.out.println(str);
String result ="";
        for (int i =0 ; i <=100; i += 2){
            result += i;
            System.out.print(i+",");
        }

    }
}
