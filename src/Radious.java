import java.util.Scanner;

public class Radious {
    public static double Radious(int R) {
        double pi = 3.1416;
      double circumference  = 2*pi*R;


        return circumference;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give The Range of ODD Numbers: ");
        int R = scanner.nextInt();
        System.out.println(Radious(R));

    }
}
