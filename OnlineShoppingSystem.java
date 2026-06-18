/*Online Shopping System Using Method Overloading
Develop a Java program for an online shopping application where products can be purchased:
1.	By product name. 
2.	By product name and quantity. 
3.	By product name, quantity, and discount code. 
Display the purchase details accordingly.
Sample Input
Laptop
Laptop 2
Laptop 2 SAVE10
Sample Output
Product: Laptop

Product: Laptop
Quantity: 2

Product: Laptop
Quantity: 2
Discount Code: SAVE10*/



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the details: ");
		String str = sc.nextLine();
		String[] word = str.split(" ");
		if(word[0]!= null){
		    System.out.println("Product: "+ word[0]);
		}
		if(word[1]!= null){
		    System.out.println("Quantity: "+ word[1]);
		}
		if(word[2]!=null){
		    System.out.println("Discount Code: "+word[2]);
		}
		sc.close();
	}
}
