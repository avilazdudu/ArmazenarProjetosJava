package ConversorDeMoedas;
import ConversorDeMoedas.modelos.ConversorMoeda;


public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o valor a ser convertido: $");
        ConversorMoeda valor = new ConversorMoeda();
        valor.perguntarValor();


        System.out.println("Este é o valor convertido: "  + valor.converterDolarParaReal());
    }
}
