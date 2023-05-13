//Ahmed Rafat Abdelrehm
//20216628

package BankSystem;

public class Employee extends Human{

private double salary;
private String department;

@Override
public void PrintData() {
System.out.println(salary);
System.out.println(department);
System.out.println(Name);
System.out.println(Age);
System.out.println(Gender);

}
public double getsalary(){
return salary;
}
public String getDepartment(){
return department;
}
public Employee(String name, int age, String gender, double salary, String department) {
super(name, age, gender);
this.salary = salary;
this.department = department;
}
}


