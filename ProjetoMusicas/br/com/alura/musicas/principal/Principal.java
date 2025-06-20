package br.com.alura.musicas.principal;

import br.com.alura.musicas.modelos.MinhasPreferidas;
import br.com.alura.musicas.modelos.Musica;
import br.com.alura.musicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000 ; i++) {
            minhaMusica.reproduziu();
        }
        for (int i = 0; i < 50 ; i++) {
            minhaMusica.curtir();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduziu();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
