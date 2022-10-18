package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {
        /*
        Task 1
        find min and max salaray
         */
        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        double d1 = Double.parseDouble(salary1);
        double d2 = Double.parseDouble(salary2);
        double d3 = Double.parseDouble(salary3);

        System.out.println("The max salary is $" + Math.max(Math.max(d1,d2),d3));
        System.out.println("The min salary is $" + Math.min(Math.min(d1,d2),d3));

        /*
        Calculate the 10% of the minSalary
         */
        System.out.println("The 10% is $" + Math.min(Math.min(d1,d2),d3) * 0.10);


    }
}
