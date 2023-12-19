import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        int x;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("PAR");
        else
            System.out.println("IMPAR");

        in.close();
    }
}
