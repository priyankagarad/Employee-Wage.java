import java.util.Random;
public class EmployeeWageComputation
{
    //constant
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int EMPLOYEE_HOUR = 0;

    //method calculate daily_employee wage
    public int calculateDailyWage(int a, int b) {
        int result = a * b;
        return result;
    }
    //method,calculated part_time employee wage
    public int calculatePartTimeEmployeeWage(int c, int d)
    {
        int result = c * d;
        return result;
    }
    //main method
    public static void main(String[] args)
    {
        //create object of class
        EmployeeWageComputation emp = new EmployeeWageComputation();

        // create random object
        Random random = new Random();

        //return value between 0-3
        int number = random.nextInt(3);

        //check employee attendance
        if (number==0)
        {
            // method call using object of class
            int daily_wage = emp.calculateDailyWage(WAGE_PER_HOUR, FULL_DAY_HOUR);
            System.out.println("daily employee wage:" + daily_wage);
        }
        else if (number==1)
        {
            int part_time_wage = emp.calculatePartTimeEmployeeWage(WAGE_PER_HOUR, PART_TIME_HOUR);
            System.out.println("part employee wage:" + part_time_wage);
        }
        else
        {
            System.out.println(EMPLOYEE_HOUR);
        }
    }
}