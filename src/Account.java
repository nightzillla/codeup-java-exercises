// A class represents an object

public class Account {

    // Attributes with variables
    String name;
    int age;

    public static void main(String[] args) {

        Account a = new Account();
        a.setName("Pablo");
        a.setAge(34);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.printDetails();
    }
    // This is a setter. they just set the variable
    // setter set within the parameter to the variable
    // getter just get the  variable
    public void setName(String name){
        // This.name means this account name in line 6 not the parameter
        this.name = name;
    }
    public java.lang.String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public void printDetails() {
        System.out.println(name + ", " + age);
    }

}
