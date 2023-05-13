//Ahmed Rafat Abdelrehem
//20216628
package BankSystem;

class Human {
    protected String Name;
    protected int Age;
    protected String Gender;

    public Human(String name, int age, String gender){
        Name = name;
        Age = age;
        Gender = gender;

    }
    public void PrintData(){

        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Gender);
    }
    final public void Greet(){
        System.out.println("Good Morning");
    }
}
