package peliculas2;

import java.time.Year;

public class Pelicula {
	private String titulo;
	private Year agno;
	private String sinopsis;
	private Genero genero;
	private String pais;
	public Trailer trailer;
	
	public Pelicula() {
		trailer = new Trailer();
	}
}
