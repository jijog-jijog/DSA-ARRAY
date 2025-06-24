import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number want to check : ");
        Scanner scan = new Scanner(System.in);
        long val = scan.nextLong();
        scan.close();
        long rev = 0;
        long str = 0;
        long chk = val;

        while (val > 0) {
            rev = val%10;
            val = val/10;
            str = (str*10 + rev);
        }
        
        System.out.println(str);
        if (chk == str) {
            System.out.print("The given number is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
