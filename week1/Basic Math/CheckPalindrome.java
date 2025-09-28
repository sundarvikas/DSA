import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Palindrome: "+ (num == isPalindrome(num)));
        sc.close();
    }
    static int isPalindrome(int num){
        int res = 0;
        while(num>0){
            int x = num % 10;
            num /= 10;
            res = (res*10) + x;
        }
        return res;
    }
}
