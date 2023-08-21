import java.util.Scanner;

public class Avarage {
    public static float avarage(float n,float m,float o) {
      return  (n+m+o)/3;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input: ");
        float n = scanner.nextInt();
        System.out.println("Give input: ");
       float m = scanner.nextInt();
       System.out.println("Give input: ");
       float o = scanner.nextInt();
        System.out.println("Avarage of two number is: "+avarage(n,m,o));

    }
}

