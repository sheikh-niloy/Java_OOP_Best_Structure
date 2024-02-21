import java.lang.*;

public class Start
{
    public static void main(String[] args) 
    {
        //allocating objects for Teacher Class and initializing values for Parametezired Constructor
        Teacher t1 = new Teacher ("Prof. Sheikh Mamun", "11-0001", 30000);
        Teacher t2 = new Teacher ("Prof. Lutfor Hassan", "11-0002", 40000);

        //Displaying details for Teacher Class objects
        t1.showDetails();
        t2.showDetails();

        //allocating objects for Student Class and initializing values for Parametezired Constructor
        Student s1 = new Student ("Noor Alom", "21-0001", 10000);
        Student s2 = new Student ("Sheikh Hossain", "21-0001", 10000);

        //Displaying details for StudentClass objects
        s1.showDetails();
        s2.showDetails();         
    }
}