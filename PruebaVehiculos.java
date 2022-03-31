
public class PruebaVehiculos {

	public static void main (String[] argm){
		
		Estacionamiento cuidadoso = new Estacionamiento();
		System.out.println(cuidadoso.getCantidadDeLugaresCarga());
		System.out.println(cuidadoso.getCantidadLugaresVehiculo());
		
		Auto toyota = new Auto("Toyota");
		
		System.out.println(toyota.getAñoModelo());
		System.out.println(toyota.getModelo());
		System.out.println(toyota.getPatente());
		System.out.println(toyota.getNombre());
		
		
		
	}
}
