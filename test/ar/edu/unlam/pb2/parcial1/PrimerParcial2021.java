package ar.edu.unlam.pb2.parcial1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Calificacion;
import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;
import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;
import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;
import ar.edu.unlam.pb2.parcial1.Interfaces.Alquilable;
import ar.edu.unlam.pb2.parcial1.Interfaces.Vendible;
import ar.edu.unlam.pb2.parcial1.tm.Actor;
import ar.edu.unlam.pb2.parcial1.tm.Cliente;
import ar.edu.unlam.pb2.parcial1.tm.Comestible;
import ar.edu.unlam.pb2.parcial1.tm.Libro;
import ar.edu.unlam.pb2.parcial1.tm.Pelicula;
import ar.edu.unlam.pb2.parcial1.tm.Producto;
import ar.edu.unlam.pb2.parcial1.tm.Videoclub;
import ar.edu.unlam.pb2.parcial1.tm.Videojuego;

public class PrimerParcial2021 {

	@Test
	public void queSePuedaCrearUnaPelicula() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final Actor ACTOR_1_ESPERADO = new Actor("Guillermo", "Francella");
		final Actor ACTOR_2_ESPERADO = new Actor("Emilio", "Disi");
		
		// Ejecución
		Pelicula pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		pelicula.agregarActor(ACTOR_1_ESPERADO);
		pelicula.agregarActor(ACTOR_2_ESPERADO);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, pelicula.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, pelicula.getDescripcion());
		assertEquals(GENERO_ESPERADO, pelicula.getGenero());
		assertEquals(ANO_DE_ESTRENO_ESPERADO, pelicula.getAnoDeEstreno());
		assertEquals(DIRECTOR_ESPERADO, pelicula.getDirector());
		assertTrue(pelicula.actua(ACTOR_1_ESPERADO));
		
	}
	@Test
	public void queSePuedaCrearUnVideojuego() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		
		// Ejecución
		Videojuego juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, juego.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, juego.getDescripcion());
		assertEquals(CONSOLA_ESPERADA, juego.getTipo());
		
	}
	@Test
	public void queSePuedaCrearUnLibro() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		
		// Ejecución
		Libro libro = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, libro.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, libro.getDescripcion());
		assertEquals(AUTOR_ESPERADO, libro.getAutor());
		assertEquals(EDITORIAL_ESPERADA, libro.getEditorial());
		
	}
	@Test
	public void queSePuedaCrearUnComestible() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Chomps";
		
		// Ejecución
		Comestible comestible = new Comestible(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, comestible.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, comestible.getDescripcion());
	}
	
	@Test
	public void queUnaPeliculaSeaVendible() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final Double PRECIO_VENTA = 5000.0;
		
		// Ejecución
		Vendible pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		pelicula.setPrecioVenta(PRECIO_VENTA);
		
		// Validación
		assertEquals(PRECIO_VENTA, pelicula.getPrecioVenta());		
	}

	@Test
	public void queUnJuegoSeaAlquilable() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		final Double PRECIO_ALQUILER = 500.0;
		
		// Ejecución
		Alquilable juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		juego.setPrecioAlquiler(PRECIO_ALQUILER);
		
		
		// Validación
		assertEquals(PRECIO_ALQUILER, juego.getPrecioAlquiler());		
	}

	@Test
	public void queSePuedaCrearUnCliente() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Oculto";
		final Integer EDAD_ESPERADA = 23;
		
		// Ejecución
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, nuevoCliente.getCodigo());
		assertEquals(NOMBRE_ESPERADO, nuevoCliente.getNombre());
		assertEquals(APELLIDO_ESPERADO, nuevoCliente.getApellido());
		assertEquals(EDAD_ESPERADA, nuevoCliente.getEdad());
		
	}

	@Test
	public void queSePuedaVenderUnLibro() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.VENDIDO;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		video.agregarProducto(nuevoProducto);
		
		// Validación
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
		assertTrue(video.vender(nuevoProducto, nuevoCliente));
		assertEquals(NOMBRE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
	}
	
	@Test
	public void queSePuedaAlquilarUnaPelicula() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final Actor ACTOR_1_ESPERADO = new Actor("Natalie", "Portman");
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);		
		
		video.agregarProducto(nuevoProducto);
		nuevoProducto.setCalificacion(Calificacion.MAYOR18);
		
		// Validación
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
		assertTrue(video.alquilar(nuevoProducto, nuevoCliente));
		assertEquals(NOMBRE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
	}
	
	@Test
	public void queSeNoSePuedaVenderUnComestibleVendido() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Lays";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 2;
		final String APELLIDO_ESPERADO = "Mercado";
		final String NOMBRE_ESPERADO = "Juan";
		final Integer EDAD_ESPERADA = 23;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Comestible comestible = new Comestible(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);
		Cliente cliente = new Cliente(CODIGO_CLIENTE_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		video.agregarProducto(comestible);
		comestible.setEstadoActual(Estado.VENDIDO);
		
		// Validación
		assertFalse(video.vender(comestible, cliente));
	}
	
	@Test
	public void queSeNoSePuedaAlquilarUnJuegoAlquilado() {
		// Preparación
		final String APELLIDO_ESPERADO = "Tero";
		final String NOMBRE_ESPERADO = "Manuel";
		final Integer EDAD_ESPERADA = 34;
		final Integer CODIGO_CLIENTE_ESPERADO = 5;
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_VIDEOJUEGO = 25;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Cliente cliente = new Cliente(CODIGO_CLIENTE_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		Videojuego juego = new Videojuego(CODIGO_VIDEOJUEGO, NOMBRE_VIDEOCLUB, TipoDeConsola.PLAY_STATION);
		
		video.agregarProducto(juego);
		juego.setEstadoActual(Estado.ALQUILADO);
		
		// Validación
		assertFalse(video.alquilar(juego, cliente));
	}
	
	@Test
	public void queLuegoDeDevueltaUnaPeliculaSePuedaAlquilar() {
		// Preparación
		
		// Ejecución
		
		// Validación
	}
	
	@Test
	public void queSeNoSePuedaAlquilarUnPeliculaAUnMenor() {
		// Preparación
		final String APELLIDO_ESPERADO = "Lana";
		final String NOMBRE_ESPERADO = "Maria";
		final Integer EDAD_ESPERADA = 15;
		final Integer CODIGO_CLIENTE_ESPERADO = 21;
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_PELICULA = 63;
		final String DESCRIPCION_PELICULA = "Kill Bill";
		final Genero TIPO_PELICULA = Genero.ACCION;
		final Integer ANO_ESPERADO = 2003;
		final String DIRECTOR_ESPERADO = "Quentin Tarantino";
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Cliente cliente = new Cliente(CODIGO_CLIENTE_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		Pelicula peli = new Pelicula(CODIGO_PELICULA, DESCRIPCION_PELICULA, TIPO_PELICULA, ANO_ESPERADO, DIRECTOR_ESPERADO);
		
		cliente.setEdad(15);
		video.agregarProducto(peli);
		peli.setCalificacion(Calificacion.MAYOR18);
		
		// Validación
		assertFalse(video.alquilar(peli, cliente));
	}
}
