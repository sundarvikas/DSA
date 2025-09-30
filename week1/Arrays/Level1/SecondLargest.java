import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max1) max2 = arr[i];
        }
        System.out.println(max2);
    }
}
