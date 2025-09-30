import java.util.*;
public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();
        for(int i=0;i<n2;i++) arr2[i]=sc.nextInt();
        ArrayList<Integer> union = new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                    
                }
                i++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i++]);
            }
        }
        while(j<n2){
            if(union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j++]);
            }
        }
        System.out.println(union);
    }
}
