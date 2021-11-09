package clases;

public class Pregunta {
	
	private String nombre;
	private String descripcion;
	
	public Pregunta(String nombre, String desc) {
		super();
		this.nombre = nombre;
		this.descripcion = desc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String toString(){
		return nombre;
	}
}
