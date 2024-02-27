import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Item[] arr = new Item[n];
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Item(val, w);  // Create Item objects
        }
        int maxWeight = sc.nextInt();

        Arrays.sort(arr , new itemComparator());

        double ans = solve(maxWeight,arr,n);
        System.out.println(ans);

    }
    static double solve(int maxW , Item[] arr,int n){
        int currW = 0;
        double ans = 0;

        for(int i=0;i<n;i++){

            if(currW + arr[i].weight <= maxW){
                currW += arr[i].weight;
                ans += arr[i].value;
            }

            else{
                int remain = maxW - currW;
                ans += ( (double) arr[i].value / (double) arr[i].weight ) * (double) remain;
                break;
            }
        }
        return ans;
    }
}
class Item {
    int value;
    int weight;
    public Item(int v,int w){
        this.value = v;
        this.weight = w;
    }
}
//comparator for item array
class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a,Item b){
        double r1 = (double) a.value / (double) a.weight;
        double r2 = (double) b.value / (double) b.weight;

        if(r1 < r2) return 1;
        else if(r1 > r2) return -1;
        else return 0;
    }
}
