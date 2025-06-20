package CalculadoraSalaRetangular;

import CalculadoraSalaRetangular.modelos.CalculadoraSalaRetangular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerValores = new Scanner(System.in);
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        System.out.println("Qual o comprimento da sua sala?");
        sala.setComprimento(lerValores.nextDouble());
        System.out.println("Qual a altura da sua sala?");
        sala.setAltura(lerValores.nextDouble());

        System.out.println("Esta é a área da sala: " + sala.calcularArea());
        System.out.println("E este é o perímetro da mesma: " + sala.calcularPerimetro());
    }
}
