package ARRAYSpart3;

import java.util.*;
import java.util.zip.Inflater;

public class ElementGreaterByThree {
    public static void greater(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (temp.size() == 0 || !temp.contains(arr[i])) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > arr.length / 3 ) {
                    temp.add((arr[i]));
                }
            }
        }System.out.println(temp);
    }
    public static void approach(int[]arr){
        ArrayList<Integer>temp=new ArrayList<>();
        int min=(arr.length/3);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
            if(arr[i]==min){
                temp.add(arr[i]);
            }if(map.size()==2){
                break;
            }
        }System.out.println(temp);
    }
    public static void optimal(int[]arr){
        int count1=0,count2=0,element1=0,element2=0;
        for(int i=0;i<arr.length;i++){
            if(count1==0 && arr[i]!=element2){
                element1=arr[i];
                count1=1;
            }else if(count2==0 && arr[i]!=element1){
                element2=arr[i];
                count2=1;
            }else if(arr[i]==element1){
                count1++;
            }else if(arr[i]==element2){
                count2++;
            }else{
                count1--;
                count2--;
            }         
        }System.out.println(element1+" "+element2);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
        approach(arr);
        greater(arr);
        optimal(arr);
    }
}
