import java.util.Random;
public class EmployeeWageComputation
{
    //constant
    public static final int WAGE_PER_HOUR=20;
    public static final int FULL_DAY_HOUR=8;

    //method calculate daily_employee wage
    public int calculateDailyWage(int a,int b)
    {
        int result=a*b;
        return result;
    }
    //main method
    public static void main(String[] args)
    {
        //create object of class
        EmployeeWageComputation emp=new EmployeeWageComputation();
        //call method using object of class
        int daily_wage=emp.calculateDailyWage(WAGE_PER_HOUR,FULL_DAY_HOUR);
        System.out.println("daily employee wage:"+daily_wage);
    }
}
