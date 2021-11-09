package clases;

public class PreguntaNumerica extends Pregunta {
	
	private int respuesta;

	public PreguntaNumerica(String nombre, String desc, int respuesta) {
		super(nombre, desc);
		this.respuesta = respuesta;
		// TODO Auto-generated constructor stub
	}

	public int getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}


}
