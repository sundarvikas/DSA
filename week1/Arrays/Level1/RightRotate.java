import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();    
        int k = sc.nextInt()% n;
        reverse(arr, n-k, n-1);
        reverse(arr, 0, k);
        reverse(arr, 1, n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
