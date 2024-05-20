import java.util.*;

public class FractionalKnapsack {
    static double sol(Item a){
        return ((double)a.value / (double) a.weight);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Item[] arr = new Item[n];
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Item(val, w);
        }
        int maxWeight = sc.nextInt();

        Arrays.sort(arr , (a,b) -> Double.compare(sol(b) , sol(a)));
        double ans = fractionalKnapsack(maxWeight,arr,n);
        System.out.println(ans);
    }
    static double fractionalKnapsack(int w, Item arr[], int n) {
        Arrays.sort(arr, (a,b) -> Double.compare(sol(b) , sol(a)));

        double ans = 0;

        for(int i=0;i<n;i++){
            if(w >= arr[i].weight){
                w -= arr[i].weight;
                ans += (double)arr[i].value;
            } else {
                ans += ((double)arr[i].value / (double)arr[i].weight) * (double)w;
                break;
            }
        }

        return ans;
    }

}
class Item {
    int value , weight;
    Item(int v,int w){
        this.value = v;
        this.weight = w;
    }
}

