package ar.edu.unlam.pb2.parcial1.tm;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;
import ar.edu.unlam.pb2.parcial1.Interfaces.Alquilable;

public class Videojuego extends Producto implements Alquilable{
	
	private TipoDeConsola tipo;
	private Double precioAlquiler;

	public Videojuego(Integer codigo, String descripcion, TipoDeConsola consola) {
		super(codigo, descripcion);
		this.tipo = consola;
	}

	public TipoDeConsola getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeConsola consola) {
		this.tipo = consola;
	}

	@Override
	public Double getPrecioAlquiler() {
		// TODO Auto-generated method stub
		return this.precioAlquiler;
	}

	@Override
	public void setPrecioAlquiler(Double precio) {
		this.precioAlquiler = precio;
	}

}
