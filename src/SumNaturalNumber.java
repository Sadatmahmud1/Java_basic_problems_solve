import java.util.Scanner;
public class SumNaturalNumber {
    //printing natural number in java
        public static void main(String[] args) {
            System.out.println("Give input: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                sum = sum + i;

            }
            System.out.println(sum);
        }
}
