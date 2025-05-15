//package This_keyword;
//
//class AmbiguousEmployee {
//    private String name;
//    private int age;
//
//    // Constructor
//    public AmbiguousEmployee(String name, int age) {
//        name = name; // Refers to the parameter 'name'
//        age = age;   // Refers to the parameter 'age'
//    }
//
//    public void displayDetails() {
//        System.out.println("Displaying instance variable of AmbiguousEmployee::");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//}
//
//class NonAmbiguousEmployee {
//    private String name;
//    private int age;
//
//    // Constructor
//    public NonAmbiguousEmployee(String name, int age) {
//        System.out.println("Reference of this: " + this);
//        this.name = name; // Refers to the instance variable 'name'
//        this.age = age;   // Refers to the instance variable 'age'
//    }
//
//    public void displayDetails() {
//        System.out.println("Displaying instance variable of NonAmbiguousEmployee::");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//
//}
//
//public class ThisIntroduction {
//    public static void main(String[] args) {
//        AmbiguousEmployee AE1 = new AmbiguousEmployee("Abir", 10);
//        AE1.displayDetails();
//
//        NonAmbiguousEmployee NAE1 = new NonAmbiguousEmployee("Abir", 10);
//        System.out.println("Reference of NAE1: " + NAE1);
//        NAE1.displayDetails();
//
//
//    }
//}


package This_keyword;

// Enables methods chaining
public class ThisIntroduction {
    private double balance;

    public ThisIntroduction deposit(double amount) {
        System.out.println("An amount has been deposited: "+amount);
        this.balance += amount;
        return this; // Returns the current object
    }

    public ThisIntroduction withdraw(double amount) {
        System.out.println("An amount has been withdrawn: "+amount);
        this.balance -= amount;
        return this; // Returns the current object
    }

    public void showBalance() {
        System.out.println("Current Balance: $" + this.balance + "\n");
    }

    public static void main(String[] args) {
        ThisIntroduction savingsAccount = new ThisIntroduction();
        savingsAccount.showBalance();

        savingsAccount.deposit(2500);
        savingsAccount.showBalance();

        savingsAccount.withdraw(1500);
        savingsAccount.showBalance();

//        savingsAccount.deposit(2500).withdraw(1500).showBalance();


    }
}

//class Student {
//    private String name;
//    private int marks;
//
//    // Constructor 1
//    public Student(String name) {
//        // Calls Constructor 2
//        this.name = name;
////        this.marks = 40;
////        this(name, 40);
//    }
//
//    // Constructor 2
//    public Student(String name, int marks) {
//        this.name = name;
//        this.marks = marks;
//    }
//
//    public void displayDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Marks: " + marks);
//    }
//}
//
//public class ThisIntroduction {
//    public static void main(String[] args) {
//        Student abir = new Student("abir");
//        System.out.println("Value of abir object::");
//        abir.displayDetails();
//
//    }
//}