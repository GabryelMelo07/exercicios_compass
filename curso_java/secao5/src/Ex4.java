import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        int inicio, fim, duracao;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe a hora de início do jogo: ");
        inicio = in.nextInt();

        System.out.print("Informe a hora de fim do jogo: ");
        fim = in.nextInt();

        duracao = fim - inicio;

        if (inicio < fim)
            duracao = fim - inicio;
        else
            duracao = 24 - inicio + fim;

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        in.close();
    }
}
