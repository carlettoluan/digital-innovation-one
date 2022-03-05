package desafios_Spread;
import java.io.IOException;
import java.util.Scanner;

public class DesafioParImpar {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();

            if (x == 0) System.out.println("NULL");
            else if (x > 0 && x % 2 == 0) System.out.println("EVEN POSITIVE");
            else if (x < 0 && x % 2 == 0) System.out.println("EVEN NEGATIVE");
            else if (x > 0) System.out.println("ODD POSITIVE");
            else System.out.println("ODD NEGATIVE");
        }
    }
}