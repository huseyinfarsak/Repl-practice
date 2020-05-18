package My_Practice_CustomClass;

public class Employee_Sta_Obj {

    public static void main(String[] args) {

        Employee_Static emplo = new Employee_Static();

        emplo.EmployeeInfo("Ali Muhsin",987123654,"Owner",23);

        System.out.println(emplo);

        Employee_Static emplo2 = new Employee_Static();
        emplo2.EmployeeInfo("Begum",123456,"CEO",21);

        System.out.println(emplo2);

        Employee_Static emplo3 = new Employee_Static();
        emplo3.EmployeeInfo("Melike",11111111,"Excellency",50);

        System.out.println(emplo3);
    }
}
