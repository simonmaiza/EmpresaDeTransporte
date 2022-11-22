package ar.edu.unlam.pb2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ar.edu.unlam.pb2.clases.Auto;
import ar.edu.unlam.pb2.clases.Autobus;
import ar.edu.unlam.pb2.clases.Chofer;
import ar.edu.unlam.pb2.clases.Moto;
import ar.edu.unlam.pb2.clases.Pasajero;
import ar.edu.unlam.pb2.clases.Vehiculo;
import ar.edu.unlam.pb2.exepciones.NoAdmiteMasPasajerosException;
import ar.edu.unlam.pb2.exepciones.NoSePuedaCambiarElChoferException;

public class TestEmpresaTransporte {

	
	@Test
	public void queSePuedanCrearUnaMoto() {
		
		Chofer chofer = new Chofer("Simon");
		Pasajero pasajero = new Pasajero("Carlos");
		Double kmRecorridos = 100.0;
		
		Vehiculo moto = new Moto(chofer , pasajero , kmRecorridos);
		
		assertNotNull(moto);
	}
	
	@Test
	public void queSePuedaCrearUnAutobus() {
		
		Chofer chofer = new Chofer("Simon");
		Pasajero pasajero = new Pasajero("Carlos");
		Double kmRecorridos = 500.0;
		
		Vehiculo autobus = new Autobus(chofer , pasajero , kmRecorridos);
		
		assertNotNull(autobus);
	}
	
	@Test
	public void queSePuedanAgregarPasajerosALaMoto() throws NoAdmiteMasPasajerosException {
		
		Chofer chofer = new Chofer("Simon");
		Pasajero pasajero = new Pasajero("Carlos");
		Pasajero pasajero1 = new Pasajero("Joaquin");
		Double kmRecorridos = 100.0;
		
		Vehiculo moto = new Moto(chofer , pasajero , kmRecorridos);
		
		moto.agregarPasajero(pasajero);
		//moto.agregarPasajero(pasajero1);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = moto.obtenerCantidadDePasajeros();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedanAgregarPasajerosAlAutobus() throws NoAdmiteMasPasajerosException {
		
		Chofer chofer = new Chofer("Simon");
		Pasajero pasajero = new Pasajero("Carlos");
		Double kmRecorridos = 500.0;
		
		Vehiculo autobus = new Autobus(chofer , pasajero , kmRecorridos);
		
		autobus.agregarPasajero(pasajero);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = autobus.obtenerCantidadDePasajeros();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test(expected = NoSePuedaCambiarElChoferException.class)
	public void queElAutobusNoPuedaCambiarDeChoferSiHayPasajerosAdentro() throws NoAdmiteMasPasajerosException, NoSePuedaCambiarElChoferException  {
		
		Chofer chofer = new Chofer("Simon");
		Pasajero pasajero = new Pasajero("Carlos");
		Pasajero pasajero1 = new Pasajero("Carlos");
		Double kmRecorridos = 500.0;
		
		Vehiculo autobus = new Autobus(chofer , pasajero , kmRecorridos);
		
		autobus.agregarPasajero(pasajero);
		
		autobus.cambioDeChofer(pasajero);
	}
	
	@Test(expected = NoSePuedaCambiarElChoferException.class)
	public void queLaMotoNoPuedaCambiarDeChoferSiHayPasajeros() throws NoAdmiteMasPasajerosException, NoSePuedaCambiarElChoferException {
		
		Chofer chofer = new Chofer("Simon");
		Pasajero pasajero = new Pasajero("Carlos");
		Pasajero pasajero1 = new Pasajero("Joaquin");
		Double kmRecorridos = 100.0;
		
		Vehiculo moto = new Moto(chofer , pasajero , kmRecorridos);
		
		moto.agregarPasajero(pasajero);
		
		moto.cambioDeChofer(pasajero);
	}
	
	@Test
	public void queSePuedaCrearUnAuto() {
		
		Chofer chofer = new Chofer("Simon");
		Pasajero pasajero = new Pasajero("Carlos");
		Double kmRecorridos = 500.0;
		
		Vehiculo auto = new Auto(chofer , pasajero , kmRecorridos);
		
		assertNotNull(auto);
	}
	
	@Test
	public void queSePuedanAgregarPasajerosAlAuto() throws NoAdmiteMasPasajerosException {
		
		Chofer chofer = new Chofer("Simon");
		Pasajero pasajero = new Pasajero("Carlos");
		Pasajero pasajero1 = new Pasajero("Carlos");
		Pasajero pasajero2 = new Pasajero("Carlos");
		Pasajero pasajero3= new Pasajero("Carlos");
		Pasajero pasajero5 = new Pasajero("Carlos");
		Double kmRecorridos = 500.0;
		
		Vehiculo auto = new Auto(chofer , pasajero , kmRecorridos);
		
		auto.agregarPasajero(pasajero);
	
		Integer valorEsperado = 1;
		Integer valorObtenido = auto.obtenerCantidadDePasajeros();
		
		assertEquals(valorEsperado, valorObtenido);
		
		
	}
}
