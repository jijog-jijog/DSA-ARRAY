import java.util.Scanner;

public class Charlent {
     public static void main(String[] args) {
        System.out.print("Enter the Characters : ");
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
        scan.close();

        int[] arr = new int[26];

        for(int i=0 ; i< value.length() ; i++ ){
            char ch = value.charAt(i);
            arr[ch - 'A']++;
        }

        for(int i=0; i< 26; i++){
            char mh = (char) (i + 'A');
            System.out.println(mh + "  ---> " + arr[i]);
            
        }

     }
}
