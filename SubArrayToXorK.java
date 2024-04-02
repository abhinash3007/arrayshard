package ARRAYSpart3;

import java.util.HashMap;

public class SubArrayToXorK {
    public static void xorK(int[]arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int xor=0;
            for(int j=i;j<arr.length;j++){
                xor=xor^arr[j];
                if(xor==k){
                    count++;
                }
            }
        }System.out.println(count);
    }public static void optimal(int[]arr,int k){
        int count=0;
        int xr=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            xr=xr^arr[i];
            if(map.containsKey(xr^k)){
                count+=map.get(xr^k);
            }map.put(xr, map.getOrDefault(xr,0)+1);
        }System.out.println(count);
    }
    public static void main(String[] args) {
        int[]arr={4,2,2,6,4};
        xorK(arr, 6);
        optimal(arr, 6);
    }
}
