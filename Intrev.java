import java.util.Scanner;

public class Intrev {
    public static void main(String[] args) {
        System.out.print("Enter the Integer want to reverse : ");
        Scanner scan = new Scanner(System.in);
        long val = scan.nextLong();
        scan.close();
        long rev = 0 ;
        long str = 0;

        while ((val > 0)) {
            rev = val%10;
            val = val/10;
            str = (str*10 + rev);

        }
        System.out.println(str);

    }
}
