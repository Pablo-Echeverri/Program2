package clases;

public class memoria extends cancion {
	
	private String fechaCreacion;
	private boolean verificado;

	public memoria(String creador, String redactor, int numero, int posicion, String fechaCreacion, boolean verificado) {
		super(creador, redactor, numero, posicion);
		this.fechaCreacion=fechaCreacion;
		this.verificado=verificado;
		// TODO Auto-generated constructor stub
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}
	
	public String toString(){
		return fechaCreacion;
	}
	
	
	
	
	
	

}
