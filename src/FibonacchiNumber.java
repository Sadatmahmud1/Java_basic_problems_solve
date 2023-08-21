import java.util.Scanner;

public class FibonacchiNumber {

    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Range: ");
        int R = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i<=R; i++){

            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
