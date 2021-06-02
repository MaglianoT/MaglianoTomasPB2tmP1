package ar.edu.unlam.pb2.parcial1.tm;

public class Cliente extends Persona {
	
	private Integer codigo;

	public Cliente(Integer codigo, String apellido, String nombre, Integer edad) {
		super(nombre, apellido, edad);
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
