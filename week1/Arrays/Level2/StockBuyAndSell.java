import java.util.Scanner;
public class StockBuyAndSell{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int res = 0, j = 0;
        for(int i=0;i<n;i++){
            if(arr[j]>arr[i]) j=i;
            else res = Math.max(res,arr[i]-arr[j]);
        }
        System.out.println(res);
    }
}