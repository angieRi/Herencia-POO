
public class Estacionamiento {
	
	private double maximaCargaPermitida;
	private int cantidadDeLugaresCarga;
	private int cantidadLugaresVehiculo;
	

	public Estacionamiento(){
	
		this.maximaCargaPermitida = 1000;
		this.cantidadDeLugaresCarga = 20;
		this.cantidadLugaresVehiculo = 40;
	}
	public double getMaximaCargaPermitida() {
	
		return maximaCargaPermitida;
	}
	
	public int getCantidadDeLugaresCarga() {
		
		return cantidadDeLugaresCarga;
	}
	
	public int getCantidadLugaresVehiculo() {
		
		return cantidadLugaresVehiculo;
	}
	public void setMaximaCargaPermitida(double maximaCargaPermitida) {
		this.maximaCargaPermitida = maximaCargaPermitida;
	}
	
}