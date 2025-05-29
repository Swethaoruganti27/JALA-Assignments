package loops;
import java.util.Scanner;
public class ArmstrongNumber {

    public static boolean isArmstrong(int n) {
        int r, result = 0;
        int temp = n;
        while (n != 0) {
            r = n % 10;
            result += (r * r * r);
            n = n / 10;
        }
        return temp == result;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }
}
