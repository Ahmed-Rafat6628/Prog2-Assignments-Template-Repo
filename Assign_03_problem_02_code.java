//Ahmed Rafat Abdelrehem 
//20216628
import java.util.Scanner;
public class Assignment2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib1 = 0, fib2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 + " ");
 
         
            int fib_n= fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_n;
        }
    }
}
