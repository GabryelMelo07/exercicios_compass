import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
		double salario, imposto;

        Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

        System.out.println("Informe o salário: ");
        salario = in.nextDouble();
		
		if (salario <= 2000.0)
			imposto = 0.0;
		else if (salario <= 3000.0)
			imposto = (salario - 2000.0) * 0.08;
		else if (salario <= 4500.0)
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		else
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

		if (imposto == 0.0)
			System.out.println("Isento");
		else
			System.out.printf("R$ %.2f", imposto);
		
		in.close();
    }
}
