package ar.edu.unlam.pb2.exepciones;

public class NoAdmiteMasPasajerosException extends Exception {

	private String mensaje;

	public NoAdmiteMasPasajerosException(String mensaje) {
		this.mensaje = mensaje;
	}

}
