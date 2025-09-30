import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int key = sc.nextInt();
        int flag = 0;
        for(int num:arr){
            if(num==key) flag = 1;
        }
        System.out.println((flag==1) ? "Found": "Not Found");
    }
}
