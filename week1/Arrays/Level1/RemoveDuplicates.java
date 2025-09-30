import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int j=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        j++;
        while(j<n) arr[j++] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
