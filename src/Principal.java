import screenmatchCalculos.CalculadoraDeTiempo;
import screenmatchCalculos.FiltroRecomendaciones;
import screenmatchModelos.Episodio;
import screenmatchModelos.Pelicula;
import screenmatchModelos.Serie;
public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021); 
        miPelicula.setDuracionEnMinutos(102);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluar(8.0);
        miPelicula.evaluar(9.0);
        miPelicula.evaluar(10.0);

        System.out.println("El total de evaluaciones es: " + miPelicula.getPuntuacionesTotales());
        System.out.println("Puntuación promedio: " + miPelicula.puntuacionPromedio());
        

        System.out.println("*************************************");    

        Pelicula miSegundaPelicula = new Pelicula();
        miSegundaPelicula.setNombre("Avengers"); 
        miSegundaPelicula.setFechaDeLanzamiento(2022);
        miSegundaPelicula.setDuracionEnMinutos(120);

        miSegundaPelicula.muestraFichaTecnica();

        System.out.println("*************************************");

        Serie miSerie = new Serie();
        miSerie.setNombre("Game of Thrones");
        miSerie.setFechaDeLanzamiento(2011);
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
        
        

    }
}


