import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner numeroInserido = new Scanner(System.in);
        System.out.print("Digite um número que você deseja saber a tabuada: ");
        int numero = numeroInserido.nextInt();

        System.out.println("---Aqui estão os resultados---");
        for (int i = 1; i < 11; i++){
            System.out.println(numero * i);
        }
    }
}
