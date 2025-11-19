import java.util.Scanner;

public class SentinalSum {

    public static void main(String[] args) {
        calculateSum();
    }

    public static void calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.print("Enter number: ");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.print("Invalid input Sum is 0");
            return;
        }

     while (number != -1) {
         sum += number;
            
         System.out.print("Enter number: ");
         if (scanner.hasNextInt()) {
                number = scanner.nextInt();
         } else {
             System.out.println("error");
                number = -1; 
     }
     }

        System.out.println("the sum is " + sum);
    }
}