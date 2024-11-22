
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=in.nextInt();
        System.out.println("\n");
        int k=1;
        do{
            System.out.print(k*num+" ");
            k++;
        }
        while(k<=10);

        System.out.println("\n");
        System.out.print("Enter age: ");
        int age=in.nextInt();

        if(age>=18 || age<=100){
            System.out.println("Your are eligible to Vote");
        }
        else{
            System.out.println("Your are not eligible to Vote");
        }
    }
}
