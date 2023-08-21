import java.util.Scanner;

public class VotingEligibility {
    public static int VoteORnot(int n) {
        if (n<18){
            System.out.println("Persons age is "+n+" So Person is not Eligable for voting");
        }
        else {
            System.out.println("Persons age is "+n+" So Person is Eligable for voting");

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input: ");
        int n = scanner.nextInt();
        System.out.println(VoteORnot(n));

    }
}