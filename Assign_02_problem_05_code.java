//Ahmed Rafat Abdelrehem
//20216628
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt(); 
while (t-- > 0) {
int x = sc.nextInt();
boolean isPrime = true;
if (x <= 1) {
isPrime = false;
}
for (int i = 2; i <= x/2; i++) {
if (x % i == 0) {
isPrime = false;
break;
}
}          
if (isPrime) 
 System.out.println("Prime");
 else 
System.out.println("Not");
}       
}
}








import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt(); // number of test cases
while (t-- > 0) {
int x = sc.nextInt(); // input number
boolean isPrime = true;
if (x <= 1) {
isPrime = false;
            }
for (int i = 2; i <= x/2; i++) {
if (x % i == 0) {
isPrime = false;
break;
}
}          
if (isPrime) 
 System.out.println("Prime");
 else 
System.out.println("Not");
 
}
        
 
    }
}
