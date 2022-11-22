package ar.edu.unlam.pb2.clases;

import ar.edu.unlam.pb2.exepciones.NoAdmiteMasPasajerosException;
import ar.edu.unlam.pb2.exepciones.NoSePuedaCambiarElChoferException;

public abstract class Vehiculo {
	
	public abstract void agregarPasajero(Pasajero pasajero) throws NoAdmiteMasPasajerosException;
	
	public abstract Integer obtenerCantidadDePasajeros();
	
	public abstract void cambioDeChofer(Pasajero pasajero) throws NoSePuedaCambiarElChoferException;
}
