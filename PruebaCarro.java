//ejem Herencia 
public class PruebaCarro {
	
	public  static void main(String[] argm){
		
		CarroBMW carro = new CarroBMW();
		carro.apagar();
		carro.encender();
		carro.Turbo();
		
		
	
		Carrito carro2 = new Carrito();
		carro2.Turbo();
		carro2.getAltura();
		carro2.apagar();
		carro2.encender();
		
		/*
		 * ejem POLIMORFISMO
		 * se pueden utilizar metodos con el mismo nombre dentro de clases heredades o mismo tipo, pero el codigo deben ser diferentes 
		 */
		Carro car = new CarroBMW();
		car.informacion();
		car.encender();
		
		Carro car2 = new Carrito();
		car2.informacion();
	
		
	}
		
}
