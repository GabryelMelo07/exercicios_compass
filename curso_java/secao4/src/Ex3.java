import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        int a, b, c, d, diferenca;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        a = in.nextInt();

        System.out.print("Informe o valor B: ");
        b = in.nextInt();

        System.out.print("Informe o valor C: ");
        c = in.nextInt();

        System.out.print("Informe o valor D: ");
        d = in.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.printf("DIFERENCA = %d", diferenca);

        in.close();
    }
}
