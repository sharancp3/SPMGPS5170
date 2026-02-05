import java.util.Scanner; //importing scanner
public class PayrollCalculator {
    public static void main(String[] args) {
        String name ;
        double hourlyWage;
        int hoursWorked;
        double grossSalary ;
        double tax ;
        double netSalary ;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=scanner.nextLine();
        System.out.println("Enter your hourly wage:");
        hourlyWage=scanner.nextDouble();
        System.out.println("Enter your hours worked:");
        hoursWorked=scanner.nextInt();

        grossSalary =hourlyWage*hoursWorked;
        tax = grossSalary*(0.2);
        netSalary = grossSalary -  tax;
        System.out.println(" ");
        System.out.println("Payroll Summary for " +  name);
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Hours Worked: " +  hoursWorked);
        System.out.println("Hourly Wage: $" +  +  hourlyWage);
        System.out.println("Gross Salary: $" +  grossSalary);
        System.out.println("Taxes Deducted: $" +  tax);
        System.out.println("Net Salary: $" +  netSalary);

    }
}
