package ARRAYSpart3;

public class MaxProductSubArray {
    public static void maxProduct(int[]arr){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=1;
            for(int j=i;j<arr.length;j++){
                sum=sum*arr[j];
                max=Math.max(max, sum);
            }
        }System.out.println(max);
    }public static void optimal(int[]arr){
        int max=0;
        int pre=1;
        int suff=1;
        for(int i=0;i<arr.length;i++){
            if(pre==0){
                pre=1;
            }if(suff==0){
                suff=1;
            }pre=pre*arr[i];
            suff=suff*arr[arr.length-1-i];
            max=Math.max(max, Math.max(pre, suff));
        }System.out.println(max);
    }
    public static void main(String[] args) {
        int[]arr={2,3,-2,-5,6,-1,4};
        maxProduct(arr);
        optimal(arr);
    }
}