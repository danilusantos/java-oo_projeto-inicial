import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0, nota = 0;
        int interacoes = 0;

        while (nota != -1) {
            System.out.println("Digite a note do filme: ");
            nota = sc.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                interacoes++;
            }
        }

        System.out.println(String.format("A média de avaliações é: %.2f", mediaAvaliacao / interacoes));
    }
}
