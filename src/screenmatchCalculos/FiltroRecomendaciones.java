package screenmatchCalculos;

public class FiltroRecomendaciones {
  public void filtra(Clasificacion calificacion) {
        if (calificacion.getCalificacion() >= 4) {
            System.out.println("Recomendado");
        } else if (calificacion.getCalificacion() >= 2) {
            System.out.println("Posible");
        } else {
            System.out.println("Verlo despues");
        }
    }
}
