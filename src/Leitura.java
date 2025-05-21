import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento do filme?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme de 0 a 10 ");
        double avaliacao = leitura.nextDouble();

        leitura.close();

        System.out.println("O seu filme favorito é " + filme);
        System.out.println("O ano de lançamento deste filme é "+ anoDeLancamento);
        System.out.println("A sua avaliação para este filme é " + avaliacao);
    }
}
