package My_Pratice_Encapsulation;

public class Student {

    public String name;

    private double Result;
    private long id;

    public Student(String name){
        this.name = name;
    }

    public double getResult(){
         return Result;
    }
    public void setResult(double Result){
        this.Result= Result;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }


}
