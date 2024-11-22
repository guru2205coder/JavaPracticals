class ExceptionDemo {
    public void divide(int a, int b) throws ArithmeticException {
        System.out.println("Result: " + (a / b));
    }
}

public class Question12 {
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
