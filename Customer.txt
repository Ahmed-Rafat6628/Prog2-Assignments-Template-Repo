//Ahmed Rafat Abdelrehem
//20216628
package BankSystem;

public class Customer extends Human {

private String SSN;
private String Address;
public BankAccount Ahmed;

public Customer(String name, int age, String gender, String SSN, String Address) {
super(name, age, gender);
this.SSN = SSN;
this.Address = Address;
this.Ahmed = new BankAccount();

        }
	}
