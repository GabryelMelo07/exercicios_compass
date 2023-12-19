import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        int codPeca1, codPeca2, qtdPecas1, qtdPecas2;
        double valorPeca1, valorPeca2, result;
        
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o código da peça 1: ");
        codPeca1 = in.nextInt();

        System.out.print("Informe a quantidade da peça 1: ");
        qtdPecas1 = in.nextInt();

        System.out.print("Informe o valor da peça 1: ");
        valorPeca1 = in.nextDouble();

        System.out.print("Informe o código da peça 2: ");
        codPeca2 = in.nextInt();

        System.out.print("Informe a quantidade da peça 2: ");
        qtdPecas2 = in.nextInt();

        System.out.print("Informe o valor da peça 2: ");
        valorPeca2 = in.nextDouble();
        
        result = (valorPeca1 * qtdPecas1) + (valorPeca2 * qtdPecas2);

        System.out.printf("PEÇAS %d e %d\n", codPeca1, codPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", result);
        
        in.close();
    }
}
