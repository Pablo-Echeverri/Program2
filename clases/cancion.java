package clases;

public class cancion {
	
	private String titulo;
	private String artista;
	private int a�oLanzamiento;
	private int duracion;
	
	public cancion(String titulo, String artista, int a�oLanzamiento, int duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.a�oLanzamiento = a�oLanzamiento;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getA�oLanzamiento() {
		return a�oLanzamiento;
	}

	public void setA�oLanzamiento(int a�oLanzamiento) {
		this.a�oLanzamiento = a�oLanzamiento;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String toString(){
		return titulo;
	}

	
	
}
