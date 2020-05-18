package My_Practice_CustomClass;

public class Talebe {
    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean married;

    public void setStudent(String name, String nationality, int age, double gpa, char gender, boolean married) {

        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gpa = gpa;
        this.gender = gender;
        this.married = married;
    }

    public String toString() {
        return "Name " + name + " Nationality " + nationality + " age " + age + " gpa " + gpa
                + " gender " + gender;
    }
}
