package ar.edu.unlam.pb2.parcial1.tm;

public class Producto {
	protected Integer codigo;
	protected String descripcion;
	
	public Producto (Integer codigo, String descripcion) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
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
}
