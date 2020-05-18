package My_Pratice_Encapsulation;

public class StudentObj {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        System.out.println(student1.name);

        student1.setId(123456);
        System.out.println("Ahmet's ID : "+student1.getId());

        student1.setResult(3.80);
        System.out.println("His GPA Result is "+student1.getResult());

    }
}
