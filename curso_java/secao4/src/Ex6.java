import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        
        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        a = in.nextDouble();

        System.out.print("Informe o valor B: ");
        b = in.nextDouble();

        System.out.print("Informe o valor C: ");
        c = in.nextDouble();

        areaTriangulo = a * c / 2.0;
        areaCirculo = Math.PI * Math.pow(c, 2);
        areaTrapezio = (a + b) / 2.0 * c;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f", areaTriangulo);
        System.out.printf("\nCIRCULO: %.3f", areaCirculo);
        System.out.printf("\nTRAPEZIO: %.3f", areaTrapezio);
        System.out.printf("\nQUADRADO: %.3f", areaQuadrado);
        System.out.printf("\nRETANGULO: %.3f", areaRetangulo);
        
        in.close();
    }
}
