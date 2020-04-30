package Repl_Practices;

import java.util.ArrayList;

public class MethodsWithArrayList_187 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4};
        int []num1 = {5,6,7,8};

        ArrayList<Integer> wordlist1 = new ArrayList<>();

        for( int each : num){
           wordlist1.add(each);
        }
        for(int each1  : num1){
            wordlist1.add(each1);
        }
        System.out.println(wordlist1);
    }

}
