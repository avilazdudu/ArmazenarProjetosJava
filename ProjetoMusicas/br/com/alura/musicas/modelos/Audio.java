package br.com.alura.musicas.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int numeroDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.numeroDeCurtidas++;
    }

    public void reproduziu(){
        this.totalDeReproducoes++;
    }
}
