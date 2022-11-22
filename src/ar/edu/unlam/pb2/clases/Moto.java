package ar.edu.unlam.pb2.clases;


import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.exepciones.NoAdmiteMasPasajerosException;
import ar.edu.unlam.pb2.exepciones.NoSePuedaCambiarElChoferException;

public class Moto extends Vehiculo {

	private Chofer chofer;
	private Pasajero pasajero;
	private Double kmRecorridos;
	private Set<Pasajero>pasajerosMoto;

	public Moto(Chofer chofer, Pasajero pasajero, Double kmRecorridos) {
		this.chofer = chofer;
		this.pasajero = pasajero;
		this.kmRecorridos = kmRecorridos;
		this.pasajerosMoto = new HashSet<Pasajero>();
	}

	public Set<Pasajero> getPasajerosMoto() {
		return pasajerosMoto;
	}

	public void setPasajerosMoto(Set<Pasajero> pasajerosMoto) {
		this.pasajerosMoto = pasajerosMoto;
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
		this.pasajerosMoto.add(pasajero);
		
		if (pasajerosMoto.size() > 1) {
			throw new NoAdmiteMasPasajerosException("No entra mas gente");
		}
		
	}

	@Override
	public Integer obtenerCantidadDePasajeros() {
		return this.pasajerosMoto.size();
	}

	@Override
	public void cambioDeChofer(Pasajero pasajero) throws NoSePuedaCambiarElChoferException {
		for (Pasajero it : pasajerosMoto) {
			if(it instanceof Pasajero) {
				throw new NoSePuedaCambiarElChoferException("No se pueda cambiar el chofer");
			}
		}
		
	}
	
	

}
