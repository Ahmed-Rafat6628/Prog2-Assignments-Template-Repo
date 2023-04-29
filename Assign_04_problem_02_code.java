//Ahmed Rafat Abdelrehm
//20216628
import java.util.Scanner;
public class Assignment4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
    }
 
    for (int i = 0; i < n; i++) {
    if (a[i]<=10)
    System.out.println("A[" +i +"] = "+a[i]);
    }
    }
    }
