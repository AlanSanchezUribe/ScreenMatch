package principal;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import screenmatchModelos.Pelicula;
import screenmatchModelos.Serie;
import screenmatchModelos.Titulo;

public class PrincipalConListas {

    public static void main(String[] args) {
         Pelicula miSegundaPelicula = new Pelicula("Avengers", 2022);
        miSegundaPelicula.evaluar(9.0);
         Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evaluar(8.0);
         var peliculaDeAlan = new Pelicula("Gladiador", 2000);
        peliculaDeAlan.evaluar(10.0);
         Serie miSerie = new Serie("Game of Thrones", 2011);
      

             List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(miSegundaPelicula);
        lista.add(peliculaDeAlan);
        lista.add(miSerie);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if(item instanceof Pelicula pelicula && pelicula.getCalificacion() > 2) {
             
            System.out.println(pelicula.getCalificacion());   
            }
            
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Michael J. Fox");
        listaDeArtistas.add("Christopher Lloyd");
        listaDeArtistas.add("Lea Thompson");
        listaDeArtistas.add("Crispin Glover");
        listaDeArtistas.add("Morgan Freeman");
        listaDeArtistas.add("Tom Hanks");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        System.out.println("Lista de titulos ordenada por fecha: " + lista);
    }

}
