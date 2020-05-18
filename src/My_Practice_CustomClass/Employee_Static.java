package My_Practice_CustomClass;

public class Employee_Static {

    String name;
    long id;
    String title;
    int age;
    static String Company="Bank of Farsak";

    public void EmployeeInfo(String name,long id,String title,int age){
        this.name = name;
        this.id = id;
        this.title = title;
        this.age = age;

    }
    public static void setCompany(){

    }
public String toString(){
        return  "Employee name: "+name+" Working ID Number: "+id+" He/She is "+
                title+" "+Company+" Age: "+age;
}
}
