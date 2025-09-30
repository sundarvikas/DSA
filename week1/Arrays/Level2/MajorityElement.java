import java.util.Scanner;

public class MajorityElement {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        int ele = -1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
            if(count==0){
                ele = arr[i];
                count++;
            }
            else if(arr[i]==ele) count++;
            else count--;
        }
        System.out.println(ele);
   }
}
