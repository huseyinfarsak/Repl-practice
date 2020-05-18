package My_Practice_Constructors;

public class Car {

    String model;
    String color;
    int year;
    int mile;
    static  String brand= "Toyota";

    public Car(String model,String color, int year,int mile){
        this.model=model;
        this.color=color;
        this.year=year;
        this.mile=mile;

    }
   // public static void setBrand(){

   // }


    public String toString(){

        return brand+" "+"Car Model is "+model+" it s  "+color+" Color "+year+ " year"+" and  "+mile+
                " miles";
    }
}
