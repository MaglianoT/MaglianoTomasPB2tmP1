package ar.edu.unlam.pb2.parcial1.tm;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Calificacion;
import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Producto {
	protected Integer codigo;
	protected String descripcion;
	private Estado estado;
	private Cliente quienPoseeElProducto;
	private Calificacion calificacion;
	
	public Producto (Integer codigo, String descripcion) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.quienPoseeElProducto = null;
		this.estado = Estado.DISPONIBLE;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Estado getEstadoActual() {
		return estado;
	}

	public void setEstadoActual(Estado estado) {
		this.estado = estado;
	}

	public Cliente getQuienPoseeElProducto() {
		return quienPoseeElProducto;
	}

	public void setQuienPoseeElProducto(Cliente quienPoseeElProducto) {
		this.quienPoseeElProducto = quienPoseeElProducto;
	}

	public Calificacion getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Calificacion calificacion) {
		this.calificacion = calificacion;
	}
	
}
