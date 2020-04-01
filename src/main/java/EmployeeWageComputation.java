import java.util.Random;
public class EmployeeWageComputation
{
    //constant
    public static final int WAGE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int IS_ABSENT = 0;

    //method created for calculated employee wage
    public void calculatedMonthlyWage()
    {
        //variable
        int employeeHour=0;
        int totalSalary=0;
        int workingDays=20;
        int salary=0;
        for(int day=1;day<=workingDays;day++)
        {
            // create random object
            Random random = new Random();
            //return value between 0-3
            int choice = random.nextInt(3);
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
            //calculated daily salary
            salary = (WAGE_PER_HOUR * employeeHour);
            //calculated monthlt salary
            totalSalary = (totalSalary + salary);
        }
        System.out.println("total salary" + totalSalary);
    }
    //main method
     public static void main(String args[])
     {
         //create object of class
         EmployeeWageComputation emp = new EmployeeWageComputation();
         //method call
         emp.calculatedMonthlyWage();
     }
}