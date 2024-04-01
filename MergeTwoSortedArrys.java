package ARRAYSpart3;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArrys {
    public static void twoSortedArrays(int[]a,int[]b){
        int i=a.length-1,j=0;
        while (i>=0 && j<b.length) {
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            }else{
                break;
            }
        }Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }public static void optimal(int[]a,int[]b){
        int i=0;
        int j=0;
        while(i<a.length-1){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                checkFor2(b);
            }
            i++;
        }System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }public static void checkFor2(int[]arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[]a={1,3,5,7};
        int[]b={0,2,6,8,9};
        twoSortedArrays(a, b);
        optimal(a, b);
    }
}
