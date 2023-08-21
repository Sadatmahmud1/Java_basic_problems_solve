import java.util.Scanner;

public class OddNumberSum {
    public static int OddNumberSum(int R) {
        int sum =0;
        for (int i = 1;i<=R;i++)
        {
          if(i%2!=0){
            sum = sum + i;
        }
        }


        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give The Range of ODD Numbers: ");
        int R = scanner.nextInt();
        System.out.println(OddNumberSum(R));

}
}
