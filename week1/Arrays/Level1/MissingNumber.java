import java.util.Scanner;
public class MissingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int actualSum = 0;
        int expectedSum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            actualSum += arr[i];
            expectedSum += i+1;
        }
        System.out.println(actualSum-expectedSum);
    }
}