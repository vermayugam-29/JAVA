import java.util.*;
public class MedianByPriyanshu {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> sort=new ArrayList<>();
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                int k=sc.nextInt();
                insert(k,sort);
                int x=sort.size();
                if(x%2==0){
                    int p=sort.get(x/2)+sort.get((x/2)-1);
                    ans.add(p/2);
                }else{
                    ans.add(sort.get(x/2));
                }
            }
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void insert(int n,ArrayList<Integer> sort){
        for(int i=0;i<sort.size();i++){
            if(sort.get(i)>n){
                sort.add(i,n);
                return ;
            }
        }
        sort.add(n);
    }
}