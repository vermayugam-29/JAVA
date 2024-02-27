// linear probing
import java.util.*;
class LinearProbing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        int[] myArr=new int[5];

        for(int i=0;i<n;i++){
            int mod=arr[i]%5;
            if(myArr[mod]==0){
                myArr[mod]=arr[i];
            }
            else{
                while(true){
                    mod=(mod+1)%5;
                    if(myArr[mod]==0){
                        myArr[mod]=arr[i];
                        break;
                    }
                }
            }
        }

        for(int i=0;i<5;i++){
            if(myArr[i]!=0)
                System.out.print(myArr[i]+" ");
        }

    }
}