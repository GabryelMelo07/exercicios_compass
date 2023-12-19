import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        int a, b;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        a = in.nextInt();
        
        System.out.print("Informe o valor de B: ");
        b = in.nextInt();

        if (a % b == 0 || b % a == 0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");

        in.close();
    }
}
