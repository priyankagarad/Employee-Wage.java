import java.util.Random;
public class EmployeeWageComputation
{
    //main method
    public static void main(String[] args)
    {
        // create random object
        Random random=new Random();

        //return value between 0-2
        int number=random.nextInt(2);

        //print value
        System.out.println(number);

        //check employee attendance
        if(number==1)
        {
            System.out.println("employee is present");
        }
        else
        {
            System.out.println("employee is absent");
        }
    }
}
