//Ahmed Rafat Abdelrehem
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
        if (a[i] > 0) {
        a[i] = 1;
        } else if (a[i] < 0) {
        a[i] = 2;
        }
        }
        for (int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
        }
    	}
	}
