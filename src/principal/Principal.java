package principal;
import java.util.ArrayList;

import screenmatchCalculos.CalculadoraDeTiempo;
import screenmatchCalculos.FiltroRecomendaciones;
import screenmatchModelos.Episodio;
import screenmatchModelos.Pelicula;
import screenmatchModelos.Serie;
public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        
      
        miPelicula.setDuracionEnMinutos(102);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluar(8.0);
        miPelicula.evaluar(9.0);
        miPelicula.evaluar(10.0);

        System.out.println("El total de evaluaciones es: " + miPelicula.getPuntuacionesTotales());
        System.out.println("Puntuación promedio: " + miPelicula.puntuacionPromedio());
        

        System.out.println("*************************************");    

        Pelicula miSegundaPelicula = new Pelicula("Avengers", 2022);
        
       
        miSegundaPelicula.setDuracionEnMinutos(120);

        miSegundaPelicula.muestraFichaTecnica();

        System.out.println("*************************************");

        Serie miSerie = new Serie("Game of Thrones", 2011);
       
        miSerie.setEpisodiosPorTemporada(8);
        miSerie.setTemporadas(8);
        miSerie.setMinutosPorEpisodio(55);
        System.out.println(miSerie.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miSegundaPelicula);
        calculadora.incluye(miSerie);
        System.out.println("Tiempo necesario para ver los titulos seleccionados: " + calculadora.getTiempoTotal() + " minutos");

        miSerie.muestraFichaTecnica();

        System.out.println("*************************************");

        FiltroRecomendaciones filtro = new FiltroRecomendaciones();
        filtro.filtra(miPelicula);

        System.out.println("*************************************");

        Episodio episodio = new Episodio();
        episodio.setNombre("Episodio 1");
        episodio.setNumero(1);
        episodio.setSerie(miSerie);
        episodio.setTotalVisualizaciones(50);

        filtro.filtra(episodio);

        System.out.println("*************************************");

        var peliculaDeAlan = new Pelicula("Gladiador", 2000);
        
        peliculaDeAlan.setDuracionEnMinutos(175);
       

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(miSegundaPelicula);
        listaPeliculas.add(peliculaDeAlan);

        System.out.println("Tamaño de la lista: " + listaPeliculas.size());
        System.out.println("La primera pelicula de la lista es: " + listaPeliculas.get(0).getNombre());
        
        System.out.println("*************************************");

        System.out.println(listaPeliculas.toString());

        System.out.println("toString de la pelicula: " + listaPeliculas.get(0).toString());
       

        
        

    }
}


