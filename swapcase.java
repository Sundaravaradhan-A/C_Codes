/*Reverse the Case of a String
Write a Java program to convert all uppercase letters in a string to lowercase and all lowercase letters to uppercase.
Sample Input
JaVa ProGRam
Sample Output
jAvA pROgrAM*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter the string = ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i < sb.length();i++){
		    
		    if(Character.isLetter(sb.charAt(i))){
		        char Inverted_String = (char) (sb.charAt(i) ^ 32);
		        sb.setCharAt(i, Inverted_String); 
		    }
		    
		}
		System.out.println("Invert String: "+sb.toString());
	}
}
