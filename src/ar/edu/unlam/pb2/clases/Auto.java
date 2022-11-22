package ar.edu.unlam.pb2.clases;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.exepciones.NoAdmiteMasPasajerosException;
import ar.edu.unlam.pb2.exepciones.NoSePuedaCambiarElChoferException;

public class Auto extends Vehiculo {
	
	private Chofer chofer;
	private Pasajero pasajero;
	private Double kmRecorridos;
	private List<Pasajero>pasajerosAuto;

	public Auto(Chofer chofer, Pasajero pasajero, Double kmRecorridos) {
		this.chofer = chofer;
		this.pasajero = pasajero ;
		this.kmRecorridos = kmRecorridos;
		this.pasajerosAuto = new ArrayList<Pasajero>();
	}

	@Override
	public void agregarPasajero(Pasajero pasajero) throws NoAdmiteMasPasajerosException {
		this.pasajerosAuto.add(pasajero);
		
		if(pasajerosAuto.size() > 4) {
			throw new NoAdmiteMasPasajerosException("No entra mas gente");
		}

	}

	@Override
	public Integer obtenerCantidadDePasajeros() {
		return this.pasajerosAuto.size();
	}

	@Override
	public void cambioDeChofer(Pasajero pasajero) throws NoSePuedaCambiarElChoferException {
		

	}

}
