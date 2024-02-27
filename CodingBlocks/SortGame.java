import java.util.*;
public class SortGame {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int num[]=new int[n];
        String name[]=new String[n];
        for(int i=0;i<n;i++){
            name[i]=sc.next();
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]>num[j]){
                    //swapping in array
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                    //swapping string arr
                    String s=name[i];
                    name[i]=name[j];
                    name[j]=s;
                }
                else if(num[i]==num[j]){
                    if(name[i].compareTo(name[j])<0){
                        //swapping string arr
                        String s=name[i];
                        name[i]=name[j];
                        name[j]=s;
                    }
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            if(num[i]<t) break;
            System.out.println(name[i]+" "+num[i]);
        }
    }

}