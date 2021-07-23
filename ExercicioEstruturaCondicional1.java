import java.util.Scanner;

public class ExercicioEstruturaCondicional1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int numeroInteiro = leitor.nextInt();

        if (numeroInteiro < 0) {
            System.out.println("O número informado é Negativo");
        } else {
            System.out.println("O número informado NÃO é Negativo");

            leitor.close();
        }
    }
}

