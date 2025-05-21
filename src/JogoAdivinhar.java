import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhar {
    public static void main(String[] args) {
        Scanner chuteNumero = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        System.out.print("Foi gerado um número aleatório de 0 a 100! Digite qual número você acha que é: ");
        for (int quantidadesChute = 0; quantidadesChute < 5; quantidadesChute++ ){
            int numeroChutado = chuteNumero.nextInt();
            if (numeroChutado > numeroAleatorio){
                System.out.println("O número é menor!");
            } else if (numeroChutado < numeroAleatorio) {
                System.out.println("O número é maior!");
            } else {
                System.out.println("Você acertou!! O número era " + numeroAleatorio + "!! Parabéns!!");
                break;
            }

        }
    }
}
