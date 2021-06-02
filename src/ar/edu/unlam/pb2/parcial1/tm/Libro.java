package ar.edu.unlam.pb2.parcial1.tm;

import ar.edu.unlam.pb2.parcial1.Interfaces.Vendible;

public class Libro extends Producto implements Vendible{
	
	private String autor;
	private String editorial;
	private Double precioVenta;

	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		this.setAutor(autor);
		this.setEditorial(editorial);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public Double getPrecioVenta() {

		return this.precioVenta;
	}

	@Override
	public void setPrecioVenta(Double precio) {
		this.precioVenta = precio;
		
	}

}
