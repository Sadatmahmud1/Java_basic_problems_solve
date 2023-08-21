import java.util.Scanner;

public class CompareGrater {
    public static int GraterComp(int n,int m) {
    if (n>m){
        System.out.println(n+" is Grater");
    }
    else {
        System.out.println(m+" is Grater");

    }
     return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input: ");
        int n = scanner.nextInt();
        System.out.println("Give input: ");
        int m = scanner.nextInt();
        System.out.println(GraterComp(n,m));

    }
}
