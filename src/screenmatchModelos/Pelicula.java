package screenmatchModelos;

import screenmatchCalculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
   private String director;

public String getDirector() {
    return director;    
}

public void setDirector(String director) {
    this.director = director;
}

@Override
public int getCalificacion() {
    return (int) (puntuacionPromedio() / 2);
}

@Override
public String toString() {
    return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
}

public Pelicula(String nombre, int fechaDeLanzamiento) {
    super(nombre, fechaDeLanzamiento);
    
}

}


