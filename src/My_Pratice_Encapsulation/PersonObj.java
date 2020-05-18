package My_Pratice_Encapsulation;

public class PersonObj {

    public static void main(String[] args) {

        Person employee1 = new Person("Huseyin");
        System.out.println(employee1.name);

       employee1.setSSN(123456);
        System.out.println("Huseyin's SSN "+employee1.getSSN());

        employee1.setId(007);
        System.out.println("Huseyin James ID "+employee1.getId());
    }
}
