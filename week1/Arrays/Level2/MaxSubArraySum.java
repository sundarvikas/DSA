import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:arr){
            sum = Math.max(sum+num,num);
            res = Math.max(res,sum);
        }
        System.out.println(res);
    }
}