package My_Practice_CustomClass;

public class employee {

    String name;
    String title;
    double salary;
    long id;

    public employee(String name, String title, double salary,long id){

        this.name = name;
        this.title=title;
        this.salary= salary;
        this.id= id;



    }


   public  String  toString(){
       { return "Mr/Mrs "+name+" working our company"+" as a "+title+" her/his this; $"+salary
                +" and personal ID: "+id;}
   }
}
