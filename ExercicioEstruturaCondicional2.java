import java.util.Scanner;

public class ExercicioEstruturaCondicional2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int informeNumero = leitor.nextInt();

        if (informeNumero % 2 == 0) {
            System.out.println("PAR");
        }
            else {
            System.out.println("IMPAR");
        }

        leitor.close();
        }

    }

