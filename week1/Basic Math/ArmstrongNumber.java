import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Armstrong: "+isArmstrong(num));
    }
    static boolean isArmstrong(int num){
        int n = num;
        int res = 0;
        while(n>0){
            int x = n % 10;
            n /= 10;
            res += x*x*x;
        }
        return num == res;
    }
}
