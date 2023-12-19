import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
        double x, y;

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        x = in.nextDouble();
        
        System.out.print("Informe o segundo valor: ");
        y = in.nextDouble();

        if (x == 0.0 && y == 0.0)
            System.out.println("Origem");
        else if (x == 0.0)
            System.out.println("Eixo Y");
        else if (y == 0.0)
            System.out.println("Eixo X");
        else if (x > 0.0 && y > 0.0)
            System.out.println("Q1");
        else if (x < 0.0 && y > 0.0)
            System.out.println("Q2");
        else if (x < 0.0 && y < 0.0)
            System.out.println("Q3");
        else
            System.out.println("Q4");
        
        in.close();
    }
}
