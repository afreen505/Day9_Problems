public class UC7_Day8 {
        public static void main(String[] args) {


            int FullDayHr=8;
            int PartTimeHr=4;
            int WagePerHr=20;
            int day=0;
            int empHr=0;
            int wage = 0;
            //int n;
            while (day <= 19) {
                int n = (int) (Math.random() * 10) % 3;
                switch (n) {
                    case 1 -> {
                        System.out.println("present fullday");
                        wage = (wage + (WagePerHr * FullDayHr));
                        //System.out.println("fulltime emp wage"+wage);
                        empHr = (empHr + FullDayHr);
                        day++;
                    }
                    case 2 -> {
                        System.out.println("present PartTime");
                        wage = (wage + (WagePerHr * PartTimeHr));
                        //System.out.println("PartTime emp wage"+wage);
                        empHr = (empHr + PartTimeHr);
                        day++;
                    }
                    default -> {
                        System.out.println("absent");
                        day++;
                        if (empHr == 100)
                            break;
                    }
                }
            }
            System.out.println("total wage of a month is");
            System.out.println(wage);
            System.out.println(empHr);
            System.out.println(day);

        }
    }



