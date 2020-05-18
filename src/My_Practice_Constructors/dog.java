package My_Practice_Constructors;

public class dog {

    int age;
    String name;
    String breed;
    double weight;

    public dog(int age,String name,String breed,double weight){
        this.age = age;
        this.name= name;
        this.breed= breed;
        this.weight = weight;
    }

    public String toString(){
        return "My dog is "+age+" years old."+" Her name is "+name+"."+
                " She is "+breed+"."+ " Her weight is "+weight+"kg";
    }
}
