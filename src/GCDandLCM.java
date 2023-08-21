import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For Calculating GCD and LCM");
        System.out.println("Give First number: ");
        int N1 = sc.nextInt();
        System.out.println("Give Second number: ");
        int N2 = sc.nextInt();

        int n1 = N1;
        int n2 = N2;

        while (N1%N2 != 0){
            int Rem = N1 % N2;
            N1 = N2;
            N2 = Rem;
        }

        int GCD = N2;

        int LCM = (n1*n2)/GCD;

        System.out.println(" GCD is : "+GCD);
        System.out.println(" LCM is : "+LCM);

    }
}
