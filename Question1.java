// Main class to demonstrate various Java concepts
public class Question1 {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("John", 25, true);
        
        // Displaying initial person details
        person.displayInfo();
        
        // Accessing static variable and method
        System.out.println("Total number of persons: " + Person.getTotalPersons());
        
        // Using setter methods to modify person attributes
        person.setAge(30);
        person.setMarried(false);
        
        // Calling overloaded method
        person.displayInfo("Updated Information:");
    }
}

// Person class with various data types, constructors, and methods
class Person {
    // Instance variables (attributes)
    private String name;        // String data type
    private int age;            // int data type
    private boolean isMarried;  // boolean data type
    
    // Static variable (class variable)
    private static int totalPersons = 0;
    
    // Constructor (to initialize object attributes)
    public Person(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        totalPersons++;  // Increment totalPersons every time a new object is created
    }
    
    // Getter methods (to access private attributes)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    // Setter methods (to modify private attributes)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    
    // Static method (belongs to the class, not an object)
    public static int getTotalPersons() {
        return totalPersons;
    }
    
    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Married: " + isMarried);
    }
    
    // Overloaded method to display information with a custom message
    public void displayInfo(String message) {
        System.out.println(message);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Married: " + isMarried);
    }
}
