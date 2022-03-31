
public class Dueño {

	private String nombreDueño;
	private boolean depedir;
	private String nombreGerente;
	
	public String getNombreDueño() {
		return nombreDueño;
	}
	
	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	
	public boolean depedir() {
		
		return depedir;
	}
	
	public void setDepedir(boolean depedirGerente) {
		
		this.depedir = depedirGerente;
	}
	
	public String getNombreGerente() {
		return nombreGerente;
	}
	
	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}
}
	
class Gerente extends Dueño{
		
		private int cantidadEmpleados;
		private String domicilioEmpresa;
		
		public int getCantidadEmpleados() {
			
			if(this.depedir()){
				this.cantidadEmpleados --;
				this.setDepedir(false);
			}
			return cantidadEmpleados;
		}
		public void setCantidadEmpleados(int cantidadEmpleados) {
			this.cantidadEmpleados = cantidadEmpleados;
		}
		public String getDomicilioEmpresa() {
			return domicilioEmpresa;
		}
		public void setDomicilioEmpresa(String domicilioEmpresa) {
			this.domicilioEmpresa = domicilioEmpresa;
		}
		
	}	

class Empleado extends Gerente{
	
	private double sueldo;
	private String puesto;
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}