package My_Pratice_Encapsulation;

public class Person {

    public String name;
    private long SSN;
    private int id;

    public Person(String name){
        this.name=name;
    }
    public long getSSN(){
        return SSN;
    }
    public void setSSN(long SSN){
        this.SSN =SSN;
    }
    public  int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }

    public String toString(){
        return "Name: "+name+" Id: "+id+" Social Security Number: "+SSN;
    }
}
