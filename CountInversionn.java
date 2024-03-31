package ARRAYSpart3;

public class CountInversionn {
    public static void inversoin(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }System.out.println(count);
    }

    public static int count = 0;

    public static void optimal(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = start + (end - start) / 2;
        optimal(arr, start, mid);
        optimal(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[start + end + 1];
        int left = start;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                count += (mid - left + 1);
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= end) {
            temp[k++] = arr[right++];
        }
        for (int i = start; i <= end; i++) {
            arr[i] = temp[i-start];
        }
        //System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };
        inversoin(arr);
        optimal(arr, 0, arr.length - 1);
        System.out.println(count);
    }
}
