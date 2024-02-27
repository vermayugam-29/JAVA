import java.util.*;
//MIN - MAX HEAP
public class Ques42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }

        for(int i : pq){
            System.out.print(i +" ");
        }
    }
}
/*
#include<iostream>
#includs<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> arr;
    for(int i=0;i<n;i++){
        int val;
        cin >> val;
        arr.push_back(val);
    }

    make_heap(arr.begin(),arr.end(),greater<int>()); //min heap
    make_heap(arr.begin(),arr.end()); //max heap

    for(int i=0;i<arr.size();i++){
        cout << arr[i] << " ";
    }
    return 0;
}
 */
