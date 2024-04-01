package ARRAYSpart3;

import java.util.*;

public class MissingRepeating {
    public static void brute(int[]arr){
        for(int i=1;i<arr.length;i++){
             int count=0;
             for(int j=0;j<arr.length;j++){
                if(arr[j]== i){
                    count++;
                }
             }if(count==2){
                System.out.println(i);
             }else if(count==0){
                System.out.println(i);
             }
        }
    }public static void better(int[]arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        //}for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                count=map.get(arr[i]);
                if (count == 2) {
                    System.out.println("Repeating element: " + arr[i]);
                } else if (count == 0) {
                    System.out.println("Missing element: " + arr[i]);
                }
            }else {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }
    }public static void sort(int[]arr){
        int sum=0;
        int sum2=0;
        Arrays.sort(arr);
        int missing=-1,repeating=-1;
        for (int i = 0; i < arr.length; i++) {
            sum2+=arr[i];
            sum+=i+1;
             missing=sum-sum2;
            System.out.println(sum+" and "+sum2 );
            System.out.println("missing="+missing);
            if(arr[i]==arr[i+1]){
                repeating=arr[i];
                System.out.println("Repeating="+repeating);
                return;
    
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={4,3,6,2,2,1};
        brute(arr);
       // better(arr);
        sort(arr);
    }
}
