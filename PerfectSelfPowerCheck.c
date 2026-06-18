/*Given a positive number N, we have to find whether N can be converted to the form KK where K is
also a positive integer, using the following operation any number of times :
Choose any digit less than the current value of N, say d.
K
K = N – d2
, change d each time
If it is possible to express the number in the required form then print “Yes” otherwise print “No”.
Example:
Input: N = 13
Output: Yes
Explanation:
For integer 13 choose d = 3 : 13 – 32 = 4, 4 is of the form 22. Hence, the output is 4.
Input: N = 90
Output: No
Explanation:
It is not possible to express the number 90 in required form.*/


import java.util.*;
class Main {
    public static void main(String[] args) {
        int N, K;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N value = ");
        N = sc. nextInt();
        for(int i = 1; i <= 9 && i < N ; i++){
            K = N - (i*i);
            if( isSelfpower(K)){
               found = true;
               break;
            }
            
        }
        if( found == true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            sc.close();
    }
    public static boolean isSelfpower( long n ){
        if (n<1) return false;
        for(int k=1;;k++){
            long res = (long) Math.pow(k,k);
            if (res==n) return true;
            if( res > n ||  res < 0) return false;
        }
        
    }
}
