package ar.edu.unlam.pb2.parcial1.tm;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;
import ar.edu.unlam.pb2.parcial1.Interfaces.Vendible;

public class Pelicula extends Producto implements Vendible{

	private Integer anoDeEstreno;
	private Actor actor;
	private String director;
	private Genero genero;
	private List <Actor> actores;
	private Double precioVenta;
	
	public Pelicula (Integer codigo, String descripcion, Genero tipo, Integer ano, String director) {
		super(codigo, descripcion);
		this.genero = tipo;
		this.anoDeEstreno = ano;
		this.setDirector(director);
		this.actores = new ArrayList <> ();
	}

	public Boolean agregarActor(Actor actor) {
		Boolean agregado = false;
		for (Actor actual: actores) {
			if(actual.equals(actor)) {
				agregado = false;
			} else {
				this.actores.add(actor);
				agregado = true;
			}
		}
		
		return agregado;
	}
	
	public Boolean actua(Actor actor) {
		for (Actor actual: actores) {
			if(actual.equals(actor)) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public void setAnoDeEstreno(Integer anoEstreno) {
		this.anoDeEstreno = anoEstreno;
	}

	public Actor getActor() {
		return actor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero tipo) {
		this.genero = tipo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List <Actor> getActores() {
		return actores;
	}

	@Override
	public Double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.precioVenta;
	}

	@Override
	public void setPrecioVenta(Double precio) {
		this.precioVenta = precio;
	}

	

}
