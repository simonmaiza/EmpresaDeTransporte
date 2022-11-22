package ar.edu.unlam.pb2.exepciones;

public class NoSePuedaCambiarElChoferException extends Exception {

	private String mensaje;

	public NoSePuedaCambiarElChoferException(String mensaje) {
		this.mensaje = mensaje;
	}

}
