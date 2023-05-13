//Ahmed Rafat Abdelrehem 
//20216628

import java.util.Scanner;
public class solve {
    public static void main(String[] args) {
     BankAccount Ahmed = new BankAccount();
     BankAccount Rafat = new BankAccount(1000,"Rafat","cairobank");
     Rafat.Deposit(15000);
     Rafat.Withdraw(10000);
     System.out.println("The Balance now is " +Rafat.Balance);
     System.out.println("The number of user is: " +Rafat.NumOfUsers );
     System.out.println("The number of fcalls is: " +Rafat.NumOfcalls );
    }
}
class BankAccount{
    public double Balance ;
    public String username ;
    public String Bankname ;
    public final String Country = "Egypt" ;
    public int NumOfUsers = 0;
    public int NumOfcalls = 0;
    public  BankAccount(){
        System.out.println("Hello, new object is created ");
        NumOfUsers++;
    }
public  BankAccount(double Balance, String username, String Bankname){
        this.Balance = Balance;
        this.username = username;
        this.Bankname = Bankname;
        NumOfUsers++;
}
public void Deposit(double amount){
        Balance += amount;
        NumOfcalls++;
}
public void Withdraw (double amount){
        if (Balance >= amount){
            Balance -= amount;
                NumOfcalls++;}
        else
            System.out.println("Insufficient balance to withdraw");
}
}

