package ARRAYSpart3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum4 {
    public static void sum(int[]arr){
        Set<String>temp=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    for(int l=k+1;l<arr.length;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==0){
                            int[]quad={arr[i],arr[j],arr[k],arr[l]};
                            Arrays.sort(quad);
                            temp.add(quad[0]+" "+quad[1]+" "+quad[2]+" "+quad[3]);
                        }
                    }
                }
            }
        }
        for(String quad:temp){
            System.out.println(temp);
        }
    }public static void optimal(int[]arr){
        Arrays.sort(arr);
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }int k=j+1;
                int l=arr.length-1;
                while(k<l){
                    if(arr[i]+arr[j]+arr[k]+arr[l]==0){
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k+1]){
                            k++;
                        }while (k<l && arr[l]==arr[l-1]) {
                            l--;
                        }
                    }else if(arr[i]+arr[j]+arr[k]+arr[l]<0){
                        k++;
                    }else{
                        l--;
                    }

                }
            }
        }System.out.println(temp);
    }
    public static void main(String[] args) {
            int[]arr={-1,0,1,2,-1,-4};
            sum(arr);
            optimal(arr);
    }
}