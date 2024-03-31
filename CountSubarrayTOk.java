package ARRAYSpart3;

import java.util.HashMap;

public class CountSubarrayTOk {
    public static void countSub(int[]arr,int k){
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        for (int i = 0; i < arr.length; i++) {
            prefix+=arr[i];
            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
            }map.put(prefix, map.getOrDefault(prefix, 0)+1);
        }System.out.println(count);
    }public static void main(String[] args) {
        int[]arr={3,9,-2,4,1,-7,2,6,-5,8,-5,-7,6,2,1};
        countSub(arr, 3);
    }
}
