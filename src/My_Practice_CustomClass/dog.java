package My_Practice_CustomClass;

public class dog {

    String breed;
    String name;
    int age;
    String color;
    static int feet =4;

    public  void dogInfo(String breed, String name, int age, String color){

        this.breed=breed;
        this.name=name;
        this.age = age;
        this.color=color;
    }
    public String toString(){
        return "My dog breed is: "+breed+" her name is: "
                +name+" she is: "+age+" years old"+" her color is: "+color+" it has "+feet+ " feet";
    }

}
