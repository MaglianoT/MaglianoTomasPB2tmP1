package ar.edu.unlam.pb2.parcial1.tm;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;
import ar.edu.unlam.pb2.parcial1.Interfaces.Alquilable;
import ar.edu.unlam.pb2.parcial1.Interfaces.Vendible;

public class Videoclub {
	
	private String nombre;
	private List <Producto> productos;
	private List <Cliente> clientes;

	public Videoclub(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<> ();
		this.clientes = new ArrayList<> ();
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

	public Boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		Producto nuevo = buscarProducto(nuevoProducto);
		Boolean vendido = false;
		if(nuevo instanceof Vendible) {
			if(nuevo.getEstadoActual().equals(Estado.DISPONIBLE)) {
				nuevo.setQuienPoseeElProducto(nuevoCliente);
				nuevo.setEstadoActual(Estado.VENDIDO);
				vendido = true;
			}
		}
		return vendido;
	}
	
	public Boolean isMayorDeEdad(Cliente cliente) {
		if(cliente.getEdad()>=18) {
			return true;
		}
		
		return false;
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		for (Producto actual: productos) {
			if(actual.getCodigo().equals((nuevoProducto).getCodigo())){
				return nuevoProducto;
			}
		}
		return null;
	}

	public List <Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List <Cliente> clientes) {
		this.clientes = clientes;
	}

	public Boolean alquilar (Producto nuevoProducto, Cliente nuevoCliente) {
		Producto nuevo = buscarProducto(nuevoProducto);
		Boolean vendido = false;
		if (nuevo instanceof Alquilable) {
			if(nuevo.getEstadoActual().equals(Estado.DISPONIBLE)) {
				switch(nuevo.getCalificacion()) {
				case APTP:
					nuevo.setQuienPoseeElProducto(nuevoCliente);
					nuevo.setEstadoActual(Estado.ALQUILADO);
					vendido = true;
					break;
				case MAYOR18:
					if(nuevoCliente.getEdad()>=18) {
						nuevo.setQuienPoseeElProducto(nuevoCliente);
						nuevo.setEstadoActual(Estado.ALQUILADO);
						vendido = true;
					}
					break;
				case MAYOR7:
					if(nuevoCliente.getEdad()>=7) {
						nuevo.setQuienPoseeElProducto(nuevoCliente);
						nuevo.setEstadoActual(Estado.ALQUILADO);
						vendido = true;
					}
					break;
				}
			}
		}
		return vendido;
	}
}


