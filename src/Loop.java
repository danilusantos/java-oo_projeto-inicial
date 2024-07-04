import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mediaAvaliacao = 0, nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliação para o filme     ");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println(String.format("A média de avaliações é: %.2f", mediaAvaliacao / 3));
    }
}
