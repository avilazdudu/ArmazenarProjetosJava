import java.util.Scanner;

public class ConsultaBanco {
    public static void main(String[] args) {
        Scanner lerOpcao = new Scanner(System.in);
        Scanner lerNome = new Scanner(System.in);
        Scanner lerSaldo = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = lerNome.nextLine();
        System.out.print("Informe seu saldo para teste:");
        double saldo = lerSaldo.nextDouble();
        int opcao = 0;
        System.out.println("Olá, " + nome + "!");
        System.out.println("O seu saldo disponível é: " + saldo);
        while (opcao != 4){
            System.out.println("Digite o número da ação a ser executada");
            System.out.println("--- Ações ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber Transferência");
            System.out.println("3 - Realizar Transferência");
            System.out.println("4 - Sair");
            opcao = lerOpcao.nextInt();

            if (opcao == 1){
                System.out.println("O seu saldo disponível é: " + saldo);
            }
            else if (opcao == 2){
                System.out.print("Informe o valor a ser recebido:");
                double valorRecebido = lerSaldo.nextDouble();
                System.out.println("Valor recebido com sucesso!");
                saldo += valorRecebido;
                System.out.println("O seu saldo disponível é: " + saldo);
            }
            else if(opcao == 3){
                System.out.print("Informe o valor a ser transferido:");
                double valorTransferido = lerSaldo.nextDouble();
                if (valorTransferido > saldo){
                    System.out.println("Você não possui esse valor disponível para transferência!");
                } else {
                    System.out.println("Valor transferido com sucesso!");
                    saldo -= valorTransferido;
                    System.out.println("O seu saldo disponível é: " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Programa Finalizado!");
            } else {
                System.out.println("Opção Inválida!");
            }
        }
    }
}
