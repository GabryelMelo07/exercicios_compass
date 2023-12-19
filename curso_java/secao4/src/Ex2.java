import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        double raio, area;
        
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio do círculo: ");
        raio = in.nextDouble();

        area = Math.PI * Math.pow(raio, 2); // Dentro da classe Math do java, existe uma constante de PI. Utilizando o Math.PI, a precisão das casas decimais é maior.

        System.out.printf("A=%.4f", area);

        in.close();
    }
}
