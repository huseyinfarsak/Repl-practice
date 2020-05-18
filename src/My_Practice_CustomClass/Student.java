package My_Practice_CustomClass;

public class Student {

    String name;
    String group;
    int number;
    double gpa;

    public void getinfo(String name,String group, int number,double gpa){

        this.name = name;
        this.group = group;
        this.number = number;
        this.gpa = gpa;

    }
    public String toString(){
        return "Student name is: "+name+" Which online group: "+group+" Student number"+
                number+" Students' GPA"+gpa;
    }
}
