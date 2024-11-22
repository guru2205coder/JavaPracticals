public class Question7 {
    public static void main(String[] args) {
        Employee employee = new Employee("Gururaj", 21, "Engineer");
        employee.display();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + ", " + age);
    }
}

class Employee extends Person {
    String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public void display() {
        super.display();
        System.out.println(jobTitle);
    }
}
