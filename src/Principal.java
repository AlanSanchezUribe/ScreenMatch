public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 102;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Pelicula miSegundaPelicula = new Pelicula();
        miSegundaPelicula.nombre = "Avengers";
        miSegundaPelicula.fechaDeLanzamiento = 2022;
        miSegundaPelicula.duracionEnMinutos = 120;

        System.out.println("Mi segunda pelicula es: " + miSegundaPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miSegundaPelicula.fechaDeLanzamiento);
        System.out.println("Su duracion es: " + miSegundaPelicula.duracionEnMinutos);
    }
}
