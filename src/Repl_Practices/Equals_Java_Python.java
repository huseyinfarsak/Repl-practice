package Repl_Practices;

public class Equals_Java_Python {
    public static void main(String[] args) {
        String sentence ="We study java not python";

        while (true){
            if(sentence.equals("java")&& sentence.equals("python")){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
          break;
        }
    }
}
