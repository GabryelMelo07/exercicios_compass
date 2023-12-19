import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {

        int x;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        x = in.nextInt();

        if (x > 0)
            System.out.println("NAO NEGATIVO");
        else
            System.out.println("NEGATIVO");
        
        in.close();
    }
}
