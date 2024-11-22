public class Question8 {
    public static void main(String[] args) {
        int intResult = calculate(5);
        float floatResult = calculate(5.5f);
        char charResult = calculate('A');

        System.out.println("Integer Result: " + intResult);
        System.out.println("Float Result: " + floatResult);
        System.out.println("Char Result: " + charResult);
    }

    public static int calculate(int num) {
        return num * 2;
    }

    public static float calculate(float num) {
        return num * 1.5f;
    }

    public static char calculate(char ch) {
        return (char) (ch + 1);
    }
}
