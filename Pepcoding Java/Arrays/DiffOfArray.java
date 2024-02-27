import java.util.Scanner;

public class DiffOfArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        String st1 = "";
        for (int i : arr1) {
            st1 = st1 + i;
        }
        String st2 = "";
        for (int j : arr2) {
            st2 += j;
        }
        int a = Integer.valueOf(st1);
        int b = Integer.valueOf(st2);
        if(a>b) System.out.print(a-b);
        else System.out.print(b-a);

   
    }
}

/* Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] diff = new int[n2];
        
        int c = 0; // c = carry
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while(k>=0){
            int d = 0;
            int a1v = i >= 0? arr1[i]: 0;  //this case is for when there is a single digit value like 1 in 
                                           //array so what it does is it adds zero before 1 so that arr1 can
                                           //  also keep going rather than only arr2 moving
            if(arr2[j] + c >= a1v){
                d = arr2[j] + c - a1v;
                c = 0;
            }
            else{
                d = arr2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while(index < diff.length){  // this helps when in case when 1000-999 is done ,
                                     // so this gives value 1 rather than 0001 
            if(diff[index] == 0){
                index++;
            }
            else{
                break;
            }
        }
        while(index < diff.length){
            System.out.print(diff[index]);
        } */
