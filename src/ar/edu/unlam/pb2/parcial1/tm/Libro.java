package ar.edu.unlam.pb2.parcial1.tm;

public class Libro extends Producto{
	
	private String autor;
	private String editorial;

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

}
