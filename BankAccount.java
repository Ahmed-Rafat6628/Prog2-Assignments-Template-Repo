//Ahmed Rafat Abdelrehem
//20216628

package BankSystem;

final class BankAccount {
    double balance;

    public double getBalance() {
        return balance * 1.1;
  				}
public void setBalance(double balance) {
if (balance >= 0 || balance <= 1000000) {
this.balance += balance;
} else {
System.out.println("Invalid balance value.");
}
}

    public void setBalance(double balance, double tax_percent) {
        balance = this.balance - (this.balance * (tax_percent / 100));
        if (balance >= 0 || balance <= 1000000) {
            this.balance += balance;
        } else {
            System.out.println("Invalid balance value after tax deduction.");
        }
	}
	}


 class Solve {
    public static void main(String[] args) {
        Employee Ahmed = new Employee("Ahmed", 19, "Male", 10000, "IT");
        Ahmed.PrintData();
        System.out.println("Salary: " + Ahmed.getsalary());
        System.out.println("Department: " + Ahmed.getDepartment());

        Customer Rafat = new Customer("Ahmed", 19, "Male", "1711200325144", "10 Haram St");

        BankAccount User1 = new BankAccount();
        User1.setBalance(20000);
        BankAccount User2 = new BankAccount();
        User2.setBalance(10000,20);
        System.out.println(User1.getBalance());
        System.out.println(User2.getBalance());
}
}

