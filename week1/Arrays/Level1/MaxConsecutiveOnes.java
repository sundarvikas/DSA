import java.util.Scanner;
public class MaxConsecutiveOnes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int j = 0, res = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                res = Math.max(res,i-j);
                j = i+1;
            }
        }
        res = Math.max(res,n-j);
        System.out.println(res);
    }
}