import java.util.*;
public class PalindromicPrime {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n > 0){
		    int a = sc.nextInt();
		    
		    int prime = isPrime(a);
		    int palindrome = isPalindrome(a);
		    
		    System.out.println(prime + " " + palindrome);
		    n--;
		}
	}
	public static int isPrime(int number){
	    if(number <= 1){
	        return 0;
	    }
	    int c =2;
	    while(c*c <= number){
	        if(number%c ==0 ){
	            return 0;
	        }
	        c++;
	    }
	    
	    return 1;
	}
	public static int isPalindrome(int number){
	    int temp = number;
	    int rem = 0;
	    int rev = 0;
	    while(number > 0){
	        rem = number%10;
	        rev = rev*10 + rem;
	        number = number/10;
	    }
	    if(temp != rev){
	        return 0;
	    }
	    return 1;
	}
}
