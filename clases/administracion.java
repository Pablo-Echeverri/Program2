package clases;

public class administracion {
	
	private String nombre;
	private String pass;
	private boolean soySALPH;
	
	public administracion(String nombre, String pass, boolean soySALPH) {
		super();
		this.nombre = nombre;
		this.pass = pass;
		this.soySALPH = soySALPH;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isSoySALPH() {
		return soySALPH;
	}

	public void setSoySALPH(boolean soySALPH) {
		this.soySALPH = soySALPH;
	}
	
}
