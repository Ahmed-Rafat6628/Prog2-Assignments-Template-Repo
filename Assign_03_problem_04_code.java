//Ahmed Rafat Abdelrehem 
//20216628
import java.util.Scanner;
public class Assignment3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        int c = 0;
        while (count < y) {
        if (x % 2 == 1) {
        sum += x;
        c++;
        }
          x++;
        }
          System.out.println(sum);
        }
        }
	}