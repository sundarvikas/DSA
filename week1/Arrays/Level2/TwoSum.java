import java.util.*;
public class TwoSum{
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res[] = {-1,-1};
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int tar = sc.nextInt();
        for(int i=0;i<n;i++){
            int rem = tar - arr[i];
            if(map.containsKey(rem)){
                res[0] = map.get(rem);
                res[1] = i;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(Arrays.toString(res));
    }
}