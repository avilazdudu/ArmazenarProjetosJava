import java.util.Scanner;

public class VerificadorNumero {
    public static void main(String[] args) {
        Scanner numeroInserido = new Scanner(System.in);
        System.out.print("Digite um número para verificarmos se é positivo ou negativo: ");
        int numero = numeroInserido.nextInt();
        if (numero == 0){
            System.out.println("O número é nulo!");
        } else if (numero > 0){
            System.out.println("O número é positivo!");
        }else {
            System.out.println("O número é negativo!");
        }
    }
}
