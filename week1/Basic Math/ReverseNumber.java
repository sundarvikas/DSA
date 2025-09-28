import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = 0;
        while(num>0){
            int x = num % 10;
            num /= 10;
            res = (res*10) + x;
        }
        System.out.println("Reversed number: "+res);
        sc.close();
    }
}
