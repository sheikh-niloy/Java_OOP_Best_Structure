import java.lang.*;

public class Student
{
    //Declaring variables for Teacher Class
    private String name;
    private String id;
    private double fee;

    //Empty Constructor
    public Student()
    {
        System.out.println("Empty Constructor Student Class");
    }

    //Parametezired Constructor
    public Student(String name, String id, double salary)
    {
        System.out.println("Parametezired Constructor Student Class");
        setName(name);
        setId(id);
        setFee(fee);
    }

    //Setter method for name
    public void setName(String name)
    {
        this.name=name;
    }
    //Setter method for id
    public void setId(String id)
    {
        this.id=id;
    }
    //Setter method for salary
    public void setFee(double fee)
    {
        this.fee=fee;
    }

    //Getter method for name
    public String geString()
    {
        return name;
    }
    //Getter method for id
    public String getId()
    {
        return id;
    }
    //Getter method for salary
    public double getSalary()
    {
        return fee;
    }

    //displaying all the details of Teacher Class by creating showDetails class
    public void showDetails()
    {
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Tution Fees: " + fee + "Taka");
    }
}