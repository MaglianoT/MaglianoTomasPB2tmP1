package ar.edu.unlam.pb2.parcial1.tm;

import ar.edu.unlam.pb2.parcial1.Interfaces.Vendible;

public class Comestible extends Producto implements Vendible{
	
	private Double precioVenta;

	public Comestible(Integer codigo, String descripcion) {
		super(codigo, descripcion);
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
