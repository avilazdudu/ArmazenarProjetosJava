package ConversorDeMoedas.modelos;


import ConversorDeMoedas.calculos.ConversaoFinanceira;

import java.util.Scanner;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valorDolar;

    public double perguntarValor(){
        Scanner lerValor = new Scanner(System.in);
        this.valorDolar = lerValor.nextDouble();
        return valorDolar;
    }
    @Override
    public double converterDolarParaReal(){
        return this.valorDolar * 5.67;
    }
}
