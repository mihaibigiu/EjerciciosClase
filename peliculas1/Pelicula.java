package peliculas1;

import java.time.Year;

public class Pelicula {
	private String titulo;
	private Year agno;
	private String sinopsis;
	private Genero genero;
	private String pais;
	public java.util.Collection actor = new java.util.TreeSet();
	public java.util.Collection director = new java.util.TreeSet();
	public java.util.Collection productor = new java.util.TreeSet();
	public java.util.Collection guionista = new java.util.TreeSet();
	public Trailer trailer;
	
	public Pelicula() {
		trailer = new Trailer();
	}
}
