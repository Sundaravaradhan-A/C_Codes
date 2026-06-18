/* Employee Salary Calculator Using Static Methods
Create a Java class named SalaryCalculator with static methods to calculate gross salary, deductions, and net salary. Call these methods without creating an object.
Sample Input
Basic Salary = 30000
Allowance = 5000
Deduction = 2000
Sample Output
Gross Salary = 35000
Net Salary = 33000
*/



import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Salary = ");
		int bs = sc.nextInt();
		System.out.print("Enter the Allowance = ");
		int Allowance =  sc.nextInt();
		System.out.print("Enter the Deduction = ");
		int Deduction =  sc.nextInt();
		int Gross_Salary = bs+Allowance;
	    int Net_Salary =  Gross_Salary -  Deduction;
	    System.out.println("Gross Salary : " + Gross_Salary);
	    System.out.println("Net Salary : " + Net_Salary);
	    
	}
}
