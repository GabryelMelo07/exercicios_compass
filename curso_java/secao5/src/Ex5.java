import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        int codigo, quantidade;
        double total = 0;
        
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o código do produto: ");
        codigo = in.nextInt();
        
        System.out.print("Informe a quantidade do produto: ");
        quantidade = in.nextInt();

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default:
                break;
            }
            
        System.out.printf("Total: R$ %.2f", total);

        in.close();
    }
}
