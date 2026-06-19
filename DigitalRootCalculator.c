import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int  sum=0,rem=0;
		//int num = 9876;
		System.out.print("Enter the number = ");
		int  num = sc.nextInt();
		
		while(true){
		    if(num>1){
		        rem = num%10;
		        sum =sum +rem;
		        num/=10;
		        //System.out.println("num = "+num);
	            //System.out.println("sum = "+sum);
		    }
		    else if(sum/10 == 0){
		        System.out.println(sum);
		        break;
		    }
		    else if(num == 0){
		        num = sum;
		        sum=0;
		    }
		    
		    
		    else{
		        

		    }
		}
	}
}
