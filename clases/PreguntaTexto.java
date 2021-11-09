package clases;

public class PreguntaTexto extends Pregunta{
	
	private String respuesta;

	public PreguntaTexto(String nombre, String desc, String respuesta) {
		super(nombre, desc);
		this.respuesta = respuesta;
		// TODO Auto-generated constructor stub
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}	

}
