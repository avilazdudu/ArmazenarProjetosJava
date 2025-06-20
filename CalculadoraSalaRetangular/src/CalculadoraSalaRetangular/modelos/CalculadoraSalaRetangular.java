package CalculadoraSalaRetangular.modelos;


import CalculadoraSalaRetangular.calculos.CalculoGeometrico;

import java.util.Scanner;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double comprimento;


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea() {
        return altura*comprimento;
    }

    @Override
    public double calcularPerimetro() {
        return altura * comprimento * 2;
    }
}
