package ar.edu.unlam.pb2.clases;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.pb2.exepciones.NoAdmiteMasPasajerosException;
import ar.edu.unlam.pb2.exepciones.NoSePuedaCambiarElChoferException;

public class Autobus extends Vehiculo {

	private Chofer chofer;
	private Pasajero pasajero;
	private Double kmRecorridos;
	private List<Pasajero> pasajerosAutobus;

	public Autobus(Chofer chofer, Pasajero pasajero, Double kmRecorridos) {
		this.chofer = chofer;
		this.pasajero = pasajero;
		this.kmRecorridos = kmRecorridos;
		this.pasajerosAutobus = new LinkedList<Pasajero>();
	}

	public List<Pasajero> getPasajerosAutobus() {
		return pasajerosAutobus;
	}

	public void setPasajerosAutobus(List<Pasajero> pasajerosAutobus) {
		this.pasajerosAutobus = pasajerosAutobus;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(Double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	@Override
	public void agregarPasajero(Pasajero pasajero) throws NoAdmiteMasPasajerosException {
		this.pasajerosAutobus.add(pasajero);
		
		if(pasajerosAutobus.size() > 20) {
			throw new NoAdmiteMasPasajerosException("No entra mas gente");
		}
		
	}

	@Override
	public Integer obtenerCantidadDePasajeros() {
		return this.pasajerosAutobus.size();
	}

	@Override
	public void cambioDeChofer( Pasajero pasajero) throws NoSePuedaCambiarElChoferException {
		for (Pasajero it : pasajerosAutobus) {
			if(it instanceof Pasajero) {
				throw new NoSePuedaCambiarElChoferException("Hay pasajeros adentro, el chofer no puede cambiar en este momento");
			}
		}
		
		
	}
	
	
	
	

}
