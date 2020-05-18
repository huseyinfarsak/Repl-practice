package Interview_Questions;

public class String_Reverse {

    public static void main(String[] args) {

        String str= "ABCD";
        String reverse="";

        for (int i =str.length()-1; i>=0; i--){
            reverse += str.toCharArray()[i];


        }
        System.out.println(reverse);
    }
}
