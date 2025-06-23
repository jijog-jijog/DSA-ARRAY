public class Factor {
    public static void main(String[] args) {
        
        int N = 12;
        for(int k =1; k<=N; k++){
            if (N % k == 0) {
                System.out.println(k);
            }
        }
    }
}
