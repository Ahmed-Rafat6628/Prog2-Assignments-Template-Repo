//Ahmed Rafat Abdelrehem
//20216628
import java.util.Scanner;
public class Assignment2{
    public static void shape(int n){
    for(int i=n;i>=1;i--){
    for (int j = i; j >= 1; j--) {
    System.out.print("*");
    }
    System.out.println(); }
    }
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n;
    n=sc.nextInt();
    shape(n);
    }
}