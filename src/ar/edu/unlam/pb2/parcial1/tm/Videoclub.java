package ar.edu.unlam.pb2.parcial1.tm;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {
	
	private String nombre;
	private List <Producto> productos;

	public Videoclub(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<> ();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.productos.add(nuevoProducto);
	}

	public List <Producto> getProductos() {
		return productos;
	}

	public void setProductos(List <Producto> productos) {
		this.productos = productos;
	}

}
