
public class Auto extends Vehiculo {
	
	private Color color;
	private String modelo;
	private String nombre;
	
	public Auto(String nombre){
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor(){
		
		return color;
	}
	
}
