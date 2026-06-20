/* Count Occurrences of Characters
Write a Java program to count the frequency of each character in a given string.
Sample Input
banana
Sample Output
b : 1
a : 3
n : 2
*/



import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter the string = ");
		String str =  sc.next();
		//String str = "banana";

		char[] chars = str.toCharArray();

		boolean visited[] =  new boolean[chars.length];

		for(int i=0; i<chars.length; i++) {

			if(visited[i]== true) {
				continue;
			}

			int count = 1;

			for(int j=i+1 ; j<chars.length; j++) {
				if(chars[i] == chars[j]) {
					count++;
					visited[j]=true;
				}

			}

			System.out.println(chars[i]+" = "+count++);

		}


	}
}
