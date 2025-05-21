import java.util.Scanner;

public class ComparadorNumero {
    public static void main(String[] args) {
        Scanner lerNumeros = new Scanner(System.in);
        System.out.println("Digite o primeiro número para comparação: ");
        int numeroUm = lerNumeros.nextInt();
        System.out.println("Digite o segundo número para comparação: ");
        int numeroDois = lerNumeros.nextInt();
        if (numeroUm == numeroDois){
            System.out.println("Os números inseridos são iguais!");
        } else  { //else poderia ser else if(numeroUm != numeroDois) porem ficaria repetitivo!
            System.out.println("Os números inseridos são diferentes!");
            if (numeroUm > numeroDois){
                System.out.println("E o primeiro número é maior que o segundo!");
            } else {
                System.out.println("E o segundo número é maior que o primeiro!");
            }
        }
    }
}
