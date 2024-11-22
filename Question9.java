public class Question9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
