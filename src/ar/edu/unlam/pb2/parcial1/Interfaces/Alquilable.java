package ar.edu.unlam.pb2.parcial1.Interfaces;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Calificacion;

public interface Alquilable {
	public Double getPrecioAlquiler();
	public void setPrecioAlquiler(Double precio);
	public void setCalificacion(Calificacion calificacion);
	public Calificacion getCalificacion();
}
