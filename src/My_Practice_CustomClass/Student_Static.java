package My_Practice_CustomClass;

public class Student_Static {

    String name;
    String group;
    long number;
    String object;
    static String school= "CyberTek";

    public  void setSchool(String name, String group, long number,String object){
 this.name = name;
 this.group = group;
 this.number=number;
 this.object=object;


    }
    public static void staticschool(){
      //  System.out.println("School name is "+school);
    }

    public String toString(){

        return "Student name: "+name+" Group Name: "+group+" Number of Students "+number+
                " Object of class: "+object+" School name is: "+school;
    }
}
