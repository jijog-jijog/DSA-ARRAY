import java.util.Scanner;

public class Intcount {
    public static void main(String[] args) {
        System.out.print("Enter the number want to count :  ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        scan.close();

        int count = 0;
        while (value > 0) {
            count = count+1;
            value = value/10;
        }
        System.out.println("The Length of the Integer is : " + count);
    }
}
