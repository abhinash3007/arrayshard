package ARRAYSpart3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sum3 {
    public static void sum(int[]arr){
        Set<String>temp=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        int[]triplets={arr[i],arr[j],arr[k]};
                        Arrays.sort(triplets);         
                         temp.add(triplets[0] + " " + triplets[1] + " " + triplets[2]);
                    }
                }
            }
        }for (String triplets : temp) {
            System.out.println(triplets);
        }
    }public static void optimal(int[]arr){
        ArrayList<Integer>temp=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1,k=arr.length-1;
            while (j<k) {
                if(arr[i]+arr[j]+arr[k]==0){
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    j++;
                    k--;
                    while (j<k && arr[k]==arr[k-1]) {
                        k--;
                    }
                    while (j<k && arr[j]==arr[j+1]) {
                        j++;
                    }
                }else if(arr[i]+arr[j]+arr[k]>0){
                    k--;
                }else{
                    j++;
                }
            }          
        }System.out.println(temp+" ");
    }
    public static void main(String[] args) {
        int[]arr={-1,0,1,2,-1,-4};
        sum(arr);
        optimal(arr);
    }
}
