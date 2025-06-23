public class optimizedfactor {

    public static void main(String[] args) {
      int N = 12;
      for(int a =1; a*a<=N; a++){
        if (N%a==0) {
            System.out.println(a);
            System.out.println("count = " + N/a);
        }
      }   
    }
}