
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=in.nextInt();
        int i;
        for( i=1;i<=10;i++){
            System.out.println(i*num);
        }
        System.out.println("\n");
        int j=1;
        while(j<=10){
            System.out.print(j*num+" ");
            j++;
        }
        
    
    }
    
}
