package ARRAYSpart3;

import java.util.ArrayList;

public class PascalTriangle {
    public static int ncr(int n,int r){
       int res=1;
       for(int i=0;i<r;i++){
           res=res*(n-i);
           res=res/(i+1);
       }return res;
    }public static int pascal(int n,int c){
        int element=ncr(n-1, c-1);
        return element;
    }
    public static void printRoe(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }System.out.println();
    }public static void triangle(int n){
        for(int i=1;i<n;i++){
            printRoe(i);
        }System.out.println(" ");
    }
    public static void main(String[] args) {
        System.out.println(pascal(5, 3));
        printRoe(6);
        triangle(6);
    }
}
