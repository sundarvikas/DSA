import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithKSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];  
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0, res = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == k) res = Math.max(res,i+1);
            int rem = sum - k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                res = Math.max(res,len);
            }
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        System.out.println(res);
    }  
}