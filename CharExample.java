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
            arr[ch - 'A']++;

        
        }

        for(int j=0; j<26; j++){
            char mh = (char)(j+ 'A');
            System.out.println(mh +" -----> " + arr[j] );
        }

    }
}
