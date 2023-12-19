import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {

        int a, b, result;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o primeiro valor: ");
        a = in.nextInt();
        
        System.out.print("Informe o segundo valor: ");
        b = in.nextInt();

        result = a + b;

        System.out.printf("SOMA = %d", result);
        
        in.close();
    }
}
