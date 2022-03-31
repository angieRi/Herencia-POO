/**
 * 	Modelar Vehiculos, los cuales pueden ser Autos o Utilitarios, 
 *  a su vez pueden existir camionetas o camiones, armar una jerarquía
 *  consistente con el problema a resolver. Además debe existir una playa de
 *   estacionamiento y una playa de carga, ambas tienen colecciones, 
 *   analizar de que tipo de vehículos deben ser estas colecciones. 
 *   La playa de carga tiene una colección de cargas, con un peso 
 *   determinado cada una, a medida que entra un vehiculo se le agrega 
 *   una carga que no puede ser mayor a la máxima carga permitida para 
 *   ese vehiculo. Cuando se terminan las cargas de la playa de carga no 
 *   se permite ingresar más vehiculos.
 *
 */
public class Vehiculo {

	private int puertas;
	private int patente;
	private int añoModelo;
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
	public int getAñoModelo() {
		return añoModelo;
	}
	public void setAñoModelo(int añoModelo) {
		this.añoModelo = añoModelo;
	}
	public int getPuertas() {
		return puertas;
	}

}
