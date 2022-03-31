/**
 * una herencia en java es q un objeto puede heredar caracteristicas y
 *  propiedades a otros objetos siguiendo como una gerarquia
 *  Los metodos los hereda y los atributos en el caso de que sean publicos ,
 *  no privados,
 *  Si no es hijo o nieto no hereda nada,
 *  EL hermano hereda del padre pero no del otro hermano si este tuviese funciones
 *  q no heredo del padre,o sea tiene las mismas funciones q heredadó del padre 
 *  no las q se creo por si mismos
 * 
 *EJM DE HERENCIA
 */
public class Carro {

	private double peso;
	private double altura;
	private double ancho;
	double largo;
	private int nroPuertas;
	private boolean encendido = false;
	String modelo;
	
	public Carro(){
		
		this.peso = 1100;
		this.altura = 1.40;
		this.ancho = 4;
	}
	
	public double obtenerPeso(){
		return peso;
	}
	
	public void encender(){
		
		this.encendido = true;
		System.out.println("el carro esta encendido");
	}
	
	public void apagar(){
		
		this.encendido = false;
		System.out.println("el carro esta apagado");
	}
	
	public void estado(){
		
		if(this.encendido == true)
			System.out.println("carro esta encendido");
		else
			System.out.println("carro esta apagado");
		
	}
	
	public void informacion(){
		
		System.out.println("Carro es un vehiculo que se utiliza para transportar personas");
	}
}

class CarroBMW extends Carro { // carroBMW es hijo de carro
	
	public CarroBMW(){
		
		this.modelo = "BMW";
	}
	
	public void Turbo(){
		System.out.println("Acaba de viajar a 100 km por hora");
	}
	
	public void imformacion(){
		System.out.println("BMW es un carro very expensive");
	}
}

class Carrito extends CarroBMW{// carrito hereda las funciones y atributos de carroBMW
	
	public Carrito(){
		this.modelo = "Fitito";
	}
	
	public double getAltura(){
		
		this.largo = 1.00;
		System.out.println("el largo es un metro");
		return this.largo;
	}
	
	public void imformacion(){
		System.out.println("Carrito es un pequeño vehiculo que puede transportar 2 personas");
	}
	

}