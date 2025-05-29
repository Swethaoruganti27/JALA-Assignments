package loops;

import java.util.Scanner;
public class PalindromeNumber {
    static boolean palindromeNumber(int num) {
        int rem, sum = 0, temp;
        temp = num;
        while (num > 0) {
            rem = num % 10; //getting remainder
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        //Compare the temporary number with reversed number
        // Returns if temp and sum are equal
        return temp == sum;
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a value : ");
         Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         sc.close();
        //if(true)
        if (palindromeNumber(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }
    }
}