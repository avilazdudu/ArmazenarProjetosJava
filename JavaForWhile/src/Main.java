import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String[] vendedores = {"Carlos","Mariana", "João", "Fernanda"};
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00};

        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].equalsIgnoreCase("mariana")){
                continue; //break para o laço, continue pula o indice
            }
            System.out.printf("%s - comissão %.2f", vendedores[i], calcularComissao(vendas[i]));
            System.out.println();
        }

        System.out.println("\n Testando com while");
        int j= 0;
        boolean imprimeOutro = true;
        Scanner leitura = new Scanner(System.in);
        do {
            System.out.printf("%s - comissão %.2f", vendedores[j], calcularComissao(vendas[j]));
            j++;
            System.out.println();
            System.out.println("Deseja imprimir outro?");
            imprimeOutro = leitura.nextBoolean();
        } while (imprimeOutro);

        System.out.println("Todos os nomes");

        for (String nomeVendedor: vendedores){
            System.out.println("Nome: " + nomeVendedor);
        }
    }
    public static double calcularComissao(double totalVendas){
        if (totalVendas <= 5000){
            return totalVendas*0.03;
        } else if (totalVendas <= 10000) {
            return totalVendas*0.05;
        }else {
            return  totalVendas*0.07;
        }
    }
}