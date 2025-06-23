import java.util.Scanner;

public class CharExample {
    public static void main(String[] args) {
        System.out.print("Eter the character want to print : ");
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        scan.close();
        
        int arr[] = new int[26];
        for(int i=0; i<value.length(); i++){
            char ch = value.charAt(i);
            arr[ch - 'a']++;   //we have defined array length is int value so that will -65

        
        }

        for(int j=0; j<26; j++){
            char mh = (char)(j+ 'a');
            System.out.println(mh +" -----> " + arr[j] );
        }

    }
}
