package br.com.alura.musicas.modelos;

public class Musica extends Audio{
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getNumeroDeCurtidas() {
        if (this.getTotalDeReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
