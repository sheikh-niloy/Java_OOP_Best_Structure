import java.lang.*;

public class Teacher
{
    //Declaring variables for Teacher Class
    private String name;
    private String id;
    private double salary;

    //Empty Constructor
    public Teacher()
    {
        System.out.println("Empty Constructor for Teacher Class ");
    }

    //Parametezired Constructor
    public Teacher(String name, String id, double salary)
    {
        System.out.println("Parametezired Constructor for Teacher Class");
        setName(name);
        setId(id);
        setSalary(salary);
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
    public void setSalary(double salary)
    {
        this.salary=salary;
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
        return salary;
    }

    //displaying all the details of Teacher Class by creating showDetails class
    public void showDetails()
    {
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: " + salary + "Taka");
    }
}