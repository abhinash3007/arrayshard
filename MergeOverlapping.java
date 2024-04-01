package ARRAYSpart3;

import java.lang.ProcessHandle.Info;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlapping {
    public static void overlapping(int[][]arr){
         Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j][0]<=end){
                    end=Math.max(end, arr[j][1]);
                }else{
                    break;
                }
            }temp.add(new int[]{start,end});
            i += temp.get(temp.size() - 1).length;
        }for (int[] interval : temp) {
            System.out.println(Arrays.toString(interval));
        }
    }public static void optimal(int[][]arr){
            Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
            ArrayList<int[]>temp=new ArrayList<>();
            int i=0;
            while(i<arr.length){
                int start=arr[i][0];
                int end=arr[i][1];
                while (i < arr.length - 1 && arr[i+1][0]<=end) {
                    end=Math.max(arr[i+1][1], end);
                    i++;
                }temp.add(new int[]{start, end});
                i++;
            } for (int[] interval : temp) {
                System.out.println(Arrays.toString(interval));
            }
    }
    public static void main(String[] args) {
        int[][]arr={{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        overlapping(arr);
        optimal(arr);
    }
}
