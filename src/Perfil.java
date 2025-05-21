import java.util.Scanner;

public class Perfil {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
            String nome;
        System.out.printf("\n Informe o seu nome: \n");
        nome = ler.nextLine();

        System.out.println("Olá " + nome + "!");
    }
}
