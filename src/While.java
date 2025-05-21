import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media =  0;
        double nota = 0;
        int contagemNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1){
            media += nota;
            contagemNotas++;
            }
        }
        System.out.println("Média de avaliações do filme " + media/contagemNotas);
    }
}
