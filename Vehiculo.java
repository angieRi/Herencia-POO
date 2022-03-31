/**
 * 	Modelar Vehiculos, los cuales pueden ser Autos o Utilitarios, 
 *  a su vez pueden existir camionetas o camiones, armar una jerarqu�a
 *  consistente con el problema a resolver. Adem�s debe existir una playa de
 *   estacionamiento y una playa de carga, ambas tienen colecciones, 
 *   analizar de que tipo de veh�culos deben ser estas colecciones. 
 *   La playa de carga tiene una colecci�n de cargas, con un peso 
 *   determinado cada una, a medida que entra un vehiculo se le agrega 
 *   una carga que no puede ser mayor a la m�xima carga permitida para 
 *   ese vehiculo. Cuando se terminan las cargas de la playa de carga no 
 *   se permite ingresar m�s vehiculos.
 *
 */
public class Vehiculo {

	private int puertas;
	private int patente;
	private int a�oModelo;
	private int tipoVehiculo;
	
	public int getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	public int getA�oModelo() {
		return a�oModelo;
	}
	public void setA�oModelo(int a�oModelo) {
		this.a�oModelo = a�oModelo;
	}
	public int getPuertas() {
		return puertas;
	}

}
