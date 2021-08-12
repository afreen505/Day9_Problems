public class UC2_Employee {
    public static void main(String[]args)
        {

            int Is_FULL_TIME=1;
            int EMP_RATE_PER_HOUR=20;
            int empHrs=0;
            int empWage=0;
            //Computation
            double empCheck=Math.floor(Math.random()*10)%2;
            if(empCheck==Is_FULL_TIME)
                empHrs=8;
            else
                empHrs=2;
            empWage=empHrs*EMP_RATE_PER_HOUR;
            System.out.println("Emp Wage:" +empWage);

        }
    }