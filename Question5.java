public class Question5 {
    private String name;
    private int age;

    public Question5() {
        this.name = "Gururaj";
        this.age = 21;
    }

    public Question5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Question5 student1 = new Question5();
        student1.displayInfo();
        
        Question5 student2 = new Question5("Alice", 20);
        student2.displayInfo();
    }
}
