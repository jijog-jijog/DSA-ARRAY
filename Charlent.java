import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Charlent {
    public static void main(String[] args) {
        System.out.print("Enter the Characters : ");
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
        scan.close();

        int[] arr = new int[26];

        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            arr[ch - 'A']++;
        }

        try {
            FileWriter writer = new FileWriter("output.txt");

            for (int i = 0; i < 26; i++) {
                char mh = (char) (i + 'A');
                writer.write(mh + " ---> " + arr[i] + "\n");
            }

            writer.close();
            System.out.println("Output written to output.txt successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
