package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;
import com.aluracursos.radioalura.modelos.misFavoritos;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion= new Cancion();
        miCancion.setTitulo("Tren al sur");
        miCancion.setCantante("Prisioneros");

        Podcast miPodcast=new Podcast();
        miPodcast.setPresentador("Jorge Acosta");
        miPodcast.setTitulo("hora.lonchecito");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduciones();
        }

        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduciones();
        }

        System.out.println("Total de reproduciones :"+ miCancion.getTotalDeReproduciones());
        System.out.println("Total de me gusta :" + miCancion.getTotalDeMeGusta());

        misFavoritos favoritos=new misFavoritos();

        favoritos.Audiciones(miCancion);
        favoritos.Audiciones(miPodcast);
    }
}
