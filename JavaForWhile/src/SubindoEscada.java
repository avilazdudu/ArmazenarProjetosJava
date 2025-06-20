import java.util.Scanner;

public class SubindoEscada {
    public static void main(String[] args) {
        Scanner lerDegraus = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus: ");
        int degraus = lerDegraus.nextInt();
        for (int i = 0; i < degraus; i++) {
            System.out.println("Subindo o degrau " + (i+1));
        }
        System.out.println("Você chegou ao topo!");
        lerDegraus.close();
    }
}
