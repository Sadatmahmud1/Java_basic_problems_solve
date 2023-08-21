import java.util.Scanner;

public class DesiredNumInputCount {
    public static void main(String[] args) {
        String a = "";
        int positive = 0;
        int negative = 0;
        int zero = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Give input: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (n == 0) {
                System.out.println("Count:");
                zero++;
                System.out.println("zero: " + zero);
            } else if (n < 0) {
                System.out.println("Count:");
                negative++;
                System.out.println("negative: " + negative);
            } else if (n > 0) {
                System.out.println("Count:");
                positive++;
                System.out.println("positive: " + positive);
            } else {
                System.out.println("Invalid Input");
            }

            System.out.print("Do you want to quit? (Type 'q' to quit/press enter to continue): ");
            a = scanner.nextLine();
        } while (!a.equals("q"));

        System.out.println("Final counts:");
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
