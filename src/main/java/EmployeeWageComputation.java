import java.util.Random;
public class EmployeeWageComputation
{
    //constant
    public static final int WAGE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int IS_ABSENT = 0;
    public static final int MAX_WORKING_HOURS = 100;
    public static final int MAX_DAYS = 20;

    // method created
    public int getWorkHours(int choice)
    {
        int employeeHour=0;
        switch (choice)
        {
            case IS_FULL_TIME:
                employeeHour = 8;
                break;
            case IS_PART_TIME:
                employeeHour = 4;
                break;
            case IS_ABSENT:
                employeeHour = 0;
                break;
            default:
                System.out.println("invalid choice");
        }
        return employeeHour;
    }

    //method created for calculated employee_hours
    public void calculatedEmployeeHours()
    {
        //variable
        int totalEmployeeHour=0;
        int totalWorkingDays=0;
        int employeeHour=0;
        int totalSalary=0;
        int totalMonthlyWage=0;
        while (totalWorkingDays<MAX_DAYS && totalEmployeeHour<MAX_WORKING_HOURS)
        {
            // create random object
            Random random = new Random();
            //generate value between 0-3
            int choice = random.nextInt(3);
            //method call
            employeeHour=getWorkHours(choice);
            //calculated total employee hours
            totalEmployeeHour = (totalEmployeeHour + employeeHour);

            //calculated daily employee hour for month
            int array[]=new int[50];
            totalWorkingDays++;
            array[totalWorkingDays]=dailyWage(employeeHour);
            System.out.println(array[totalWorkingDays]);

            //calculated total monthly wage
            totalMonthlyWage=(totalMonthlyWage+array[totalWorkingDays]);
        }
        System.out.println(totalMonthlyWage);
        totalSalary = (totalEmployeeHour *WAGE_PER_HOUR);
        System.out.println("total salary" + totalSalary);
    }
    //create method for daily employee wage calculation
    public int dailyWage(int employeeHour)
    {
        int daily_Wage=0;
        daily_Wage=(WAGE_PER_HOUR*employeeHour);
        return daily_Wage;
    }
     //main method
     public static void main(String args[])
     {
         //create object of class
         EmployeeWageComputation emp = new EmployeeWageComputation();
         //method call
         emp.calculatedEmployeeHours();
     }
}