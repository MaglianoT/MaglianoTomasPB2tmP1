package ar.edu.unlam.pb2.parcial1.tm;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Producto{
	
	private TipoDeConsola tipo;

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

}
