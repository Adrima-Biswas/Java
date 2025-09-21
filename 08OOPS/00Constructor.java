/*
    1. Special kind of method. // /methodName(..)
    2. Used to initialize the object
    3. It has no return type
    4. It's name must be equal to the class name
*/

class Person {
    int age;
    int ninniTime;
    int salary;
    String name;

    public Person(String x, int y, int z, int n) {
        name = x;
        age = y;
        salary = z;
        ninniTime = n;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Person p = new Person("Adrima", 9, 90, 12); // Creating an object
        
        // Accessing and printing the fields
        System.out.println(p.ninniTime);
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.salary);
        
    }
}




