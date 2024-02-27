import java.util.*;
public class KejriwalOddEven {
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem=0;
		int even =0;
		int odd=0;
		while(n>0){
		    int a = sc.nextInt();
		    even =0;
		    odd=0;
		    while(a>0){
		        rem=a%10;
		        if(rem%2==0) even+=rem;
		        else odd+=rem;
		        a=a/10;
		    }
		    if(odd%3==0 || even%4==0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    n--;
		}
}
}
