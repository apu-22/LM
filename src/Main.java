////class Lb{
////    static int cnt=0;
////    static void print(){
////        cnt++;
////        System.out.println("hola");
////    }
////}
//
//import java.util.Scanner;
//public class Main {
//    static void print(){
//        System.out.println("hola");
//    }
//
//    public static void main (String [] args){

import java.awt.*;

////        System.out.println("jdkads");
////        print();
////        Lb.print();
////        new Lb();
////        new Lb();
////        System.out.println();
//
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        String revstr = new StringBuilder(str).reverse().toString();
//        System.out.println("rev: "+revstr);
//
//        if(str.equals(revstr)){
//            System.out.println("The string is palindrame");
//        }else{
//            System.out.println("The string is not palindrame");
//        }
//
//        char ch=scan.next().charAt(0);
//        int cnt=0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==ch)cnt++;
//        }
//        System.out.println("The character '" + ch + "' appears " + cnt + " times.");
//
//    }
//}

//class Animal{
//    void makeSound(){
//        System.out.println("Dog can crate sound");
//    }
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("Dog id barkinh");
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        Dog d= new Dog();
//        d.makeSound();
//        d.bark();
//    }
//}

//class Animal{
//    void makeSound(){
//        System.out.println("Dog can crate sound");
//    }
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("Dog id barkinh");
//    }
//}
//class puppy extends Dog{
//    void beek(){
//        System.out.println("Puppy is beeking");
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        puppy d= new puppy();
//        d.makeSound();
//        d.bark();
//        d.beek();
//    }
//}

//class Animal{
//    void makeSound(){
//        System.out.println("some sound...");
//    }
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("Dog id barkinh");
//    }
//}
//class cat extends Animal{
//    void meow(){
//        System.out.println("cat is meowing");
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        cat c= new cat();
//        c.makeSound();
//        c.meow();
//
//        Dog d=new Dog();
//        d.makeSound();
//        d.bark();
//    }
//}

//interface Animal{
//   void makeSound();
//}
//interface Pet{
//    void affect();
//}
//class Dog implements Animal,Pet{
//    public void makeSound(){
//        System.out.println("Dog is barking");
//    }
//    public void affect(){
//        System.out.println("Dog is poshing");
//    }
//    public void bell(){
//        System.out.println("kjsdn");
//    }
//
//}
//public class Main {
//    public static void main(String[] args){
//    Dog d=new Dog();
//    d.makeSound();
//    d.affect();
//    d.bell();
//    }
//}
//
//class Animal{
//    String name="pet";
//    Animal(){
//        System.out.println("Animal constructor call");
//    }
//    Animal(String type){
//        System.out.println("Animql type:" +type);
//    }
//    void makesound(){
//        System.out.println("Animal can make sound");
//    }
//}
//class Dog extends Animal{
//    String name ="dog";
//
//    Dog(){
//        super();
//        System.out.println("Dog constructor call");
//    }
//    Dog(String type){
//        super(type);
//        System.out.println("Dog constructor ");
//    }
//    @Override
//
//    void makesound(){
//        super.makesound();
//        System.out.println("Dog can barking");
//        System.out.println(name);
//        System.out.println(super.name);
//    }
//}
//public class Main {
//    public static void main(String[] args){
////    Animal a =new Animal();
////    a.makesound();
//
//    Dog d1=new Dog();
//    Dog d =new Dog("mammal");
//    d.makesound();
//    }
//}


//class Lbr{
//   static int totalbookissue=0;
//   String username;
//   Lbr(String name){
//       username=name;
//   }
//   void issuebook(){
//       totalbookissue++;
//       System.out.println(username+ " issued a book");
//   }
//
//   static void distotalissedbook(){
//       System.out.println("Total book issed: "+totalbookissue);
//   }
//}
//public class Main {
//    public static void main(String[] args){
//        Lbr user1=new Lbr("apu");
//        Lbr user2=new Lbr("rayhan");
//
//        user1.issuebook();
//        user2.issuebook();
//        user1.issuebook();
//
//        Lbr.distotalissedbook();
//    }
//}

//
//
//
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner scan=new Scanner(System.in);
//
//        System.out.println("Inter a string");
//        String str = scan.nextLine();
//
//        String rev = new StringBuilder(str).reverse().toString();
//        System.out.println("Reverse string: "+rev);
//        scan.close();
//    }
//}




//class Cr {
//    // Attributes (Fields)
//    private String owner;
//    private String brand;
//    private String serialNumber;
//    private boolean isRunning;
//    private double fuelLevel;
//
//    // Constructor
//    public Cr(String owner, String brand, String serialNumber, double fuelLevel) {
//        this.owner = owner;
//        this.brand = brand;
//        this.serialNumber = serialNumber;
//        this.fuelLevel = fuelLevel;
//        this.isRunning = false; // Initially off
//    }
//
//    // Method to start the car
//    public void start() {
//        if (fuelLevel > 0) {
//            isRunning = true;
//            System.out.println("Car started.");
//        } else {
//            System.out.println("Cannot start. Fuel tank is empty.");
//        }
//    }
//
//    // Method to stop the car
//    public void stop() {
//        isRunning = false;
//        System.out.println("Car stopped.");
//    }
//
//    // Method to check fuel level
//    public void checkFuel() {
//        System.out.println("Fuel level: " + fuelLevel + " liters");
//    }
//
//    // Method to refuel the car
//    public void refuel(double liters) {
//        fuelLevel += liters;
//        System.out.println("Car refueled by " + liters + " liters.");
//    }
//
//    // Optional: Display car info
//    public void displayInfo() {
//        System.out.println("Owner: " + owner);
//        System.out.println("Brand: " + brand);
//        System.out.println("Serial Number: " + serialNumber);
//        System.out.println("Fuel Level: " + fuelLevel + " liters");
//        System.out.println("Running: " + (isRunning ? "Yes" : "No"));
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Cr myCar = new Cr("Alice", "Toyota", "SN12345", 10.5);
//
//        myCar.displayInfo();
//        myCar.checkFuel();
//        myCar.start();
//        myCar.stop();
//        myCar.refuel(5);
//        myCar.checkFuel();
//    }
//}


//package java_strings;

//public class Main {
//    public static void main(String[] args) {
//        String str = "Java is fun!";
//        String str1 = "Java is fun!";
//        String strWithNew = new String("Java is fun!");
//        System.out.println("String value: " + str);
//        System.out.println("Is String a primitive type? No, it is an object.");
//        System.out.println("Hash Code derived from memory address of str: " + System.identityHashCode(str));
//        System.out.println("Hash Code derived from memory address of str1: " + System.identityHashCode(str1));
//        System.out.println("Hash Code derived from memory address of strWithNew: " + System.identityHashCode(strWithNew));
//    }
//}



public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Labrador");

        myDog.displayInfo();
        myDog.bark();
        myDog.spin();
        myDog.run();

        // Change name and age
//        myDog.setName("Rocky");
//        myDog.setAge(4);
//
//        System.out.println("\nUpdated Info:");
//        myDog.displayInfo();
    }
}
