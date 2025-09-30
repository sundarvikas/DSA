import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int l = 0, m = 0, h = n-1;
        while(m <= h){
            if(arr[m] == 0){
                swap(arr,l,m);
                l++;
                m++;
            }
            else if(arr[m] == 1) m++;
            else{
                swap(arr,m,h);
                h--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
