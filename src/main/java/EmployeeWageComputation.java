import java.util.Random;
public class EmployeeWageComputation
{
    //constant
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int ABSENT = 0;

    //method created for calculated employee wage
    public void calculatedEmployeeWage()
    {
        //variable
        int employeeHour=0;

        // create random object
        Random random = new Random();

        //return value between 0-3
        int choice = random.nextInt(3);
        switch (choice)
        {
            case FULL_TIME:
                employeeHour = 8;
                break;
            case PART_TIME:
                employeeHour = 4;
                break;
            case ABSENT:
                employeeHour = 0;
                break;
            default:
                System.out.println("invalid choice");
        }
        int daily_employee_wage=(WAGE_PER_HOUR*employeeHour);
        System.out.println(daily_employee_wage);
    }
    //main method
     public static void main(String args[])
     {
         //create object of class
         EmployeeWageComputation emp = new EmployeeWageComputation();
         //method call
         emp.calculatedEmployeeWage();
     }
}