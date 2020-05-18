package Interview_Questions;

import java.util.Scanner;

public class ConcatWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First word1");

        String word1 = input.next();

        System.out.println("Second word2");

        String word2 = input.next();

        String result = word1.concat(word2).concat(word1).concat(word2);

        System.out.println(result);
    }
}
