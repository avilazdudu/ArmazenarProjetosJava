import java.util.Scanner;

public class Temperatura {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius para converter para Fahrenheit: ");
        int temperatura = ler.nextInt();

        int temperaturaConvertida = (int) (temperatura * 1.8) + 32;
        System.out.println(temperaturaConvertida);
    }
}
