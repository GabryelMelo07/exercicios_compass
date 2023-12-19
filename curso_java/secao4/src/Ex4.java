import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        int nroFuncionario, horasTrabalhadas;
        double valorHora, result;
        
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o número do funcionário: ");
        nroFuncionario = in.nextInt();

        System.out.print("Informe quantas horas ele trabalhou: ");
        horasTrabalhadas = in.nextInt();

        System.out.print("Informe o valor pago por hora: ");
        valorHora = in.nextDouble();

        result = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + nroFuncionario);
        System.out.printf("SALARY = U$ %.2f", result);
        
        in.close();
    }
}
