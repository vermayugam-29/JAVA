import java.util.*;

public class ArrayPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
//        while(n-- > 0) list.add(sc.nextInt());
        list.add(1);
        list.add(2);
        list.add(3);
        backtrack(list,0);
    }
    static void backtrack(List<Integer> list,int start){
        if(start == list.size()){
            System.out.print(list);
            return;
        }

        for(int i=start;i<list.size();i++){
            swap(list, start, i);
            backtrack(list, start + 1);
            swap(list, start, i);
        }
    }
    static void swap(List<Integer> list,int s,int e){
        int temp = list.get(s);
        list.set(s, list.get(e));
        list.set(e,temp);
    }
    //Recursion-----------------------------------------------------------------------
    static void permuteRecursion(List<Integer> list1,List<Integer> list2){
        if(list1.isEmpty()){
            System.out.print(new ArrayList<>(list2) +" ");
            return;
        }

        for(int i=0;i<list1.size();i++){
            List<Integer> newList1 = new ArrayList<>(list1);
            newList1.remove(i);

            List<Integer> newList2 = new ArrayList<>(list2);
            newList2.add(list1.get(i));

            permuteRecursion(newList1,newList2);
        }
    }
    //Recursive solution-----------------------------------------------------------
    static List<List<Integer>> ans = new ArrayList<>();
    static void permute(List<Integer> list,List<Integer> list2){
        if(list.isEmpty()){
            ans.add(new ArrayList<>(list2));
            return;
        }

        for(int i=0;i<list.size();i++){
            List<Integer> newList1 = new ArrayList<>();
            getList(newList1,new ArrayList<>(list),0,i);
            getList(newList1,new ArrayList<>(list),i+1,list.size());

            List<Integer> newList2 = new ArrayList<>(list2);
            newList2.add(list.get(i));

            permute(newList1,newList2);
        }
    }
    static void getList(List<Integer> newList,List<Integer> list,int s,int e){
        for(int i=s;i<e;i++){
            newList.add(list.get(i));
        }
    }
}
