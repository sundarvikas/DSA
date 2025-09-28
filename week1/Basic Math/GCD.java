import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a>0 && b>0){
            if(a>b) a -= b;
            else b -= a;
        }
        int res = (a==0) ? b : a ;
        System.out.println("GCD: " + res);
        sc.close();
    }
}
