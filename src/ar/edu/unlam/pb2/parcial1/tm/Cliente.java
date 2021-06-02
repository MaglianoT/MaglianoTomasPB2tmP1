package ar.edu.unlam.pb2.parcial1.tm;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
	
	private Integer codigoDeCliente;
	private List <Pelicula> alquiladas;

	public Cliente(Integer codigo, String apellido, String nombre, Integer edad) {
		super(nombre, apellido, edad);
		this.codigoDeCliente = codigo;
		this.alquiladas = new ArrayList<> ();
	}

	public Integer getCodigo() {
		return codigoDeCliente;
	}

	public void setCodigo(Integer codigo) {
		this.codigoDeCliente = codigo;
	}

	public List <Pelicula> getAlquiladas() {
		return alquiladas;
	}

	public void setAlquiladas(List <Pelicula> alquiladas) {
		this.alquiladas = alquiladas;
	}

}
