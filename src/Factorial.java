import java.util.Scanner;
public class Factorial {
    //printing natural number in java
    public static void main(String[] args) {
        System.out.println("Give input: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Factorial = 1;
        if (n < 0) {
            System.out.printf("Invalid");
        }
        else {
            for (int i = n; i >= 1; i--) {
                Factorial = Factorial * i;

            }
            System.out.println("Factorial of "+n+" is: "+Factorial);
        }
    }
}