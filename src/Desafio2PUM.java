import java.io.IOException;
import java.util.Scanner;

public class Desafio2PUM {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, aux=0;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= 4; x++) {
                aux += 1;
                if (x == 4) {
                    System.out.println("PUM");
                } else {
                    System.out.print(aux + " ");
                }
            }
        }
    }
}
