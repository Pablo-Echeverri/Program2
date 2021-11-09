package clases;

public class cancion {
	
	private String titulo;
	private String artista;
	private int añoLanzamiento;
	private int duracion;
	
	public cancion(String titulo, String artista, int añoLanzamiento, int duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.añoLanzamiento = añoLanzamiento;
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

	public int getAñoLanzamiento() {
		return añoLanzamiento;
	}

	public void setAñoLanzamiento(int añoLanzamiento) {
		this.añoLanzamiento = añoLanzamiento;
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
