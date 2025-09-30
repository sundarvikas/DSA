import java.util.Scanner;
public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int k = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]) k++;
        }
        System.out.println(k<=1);
    }
}
