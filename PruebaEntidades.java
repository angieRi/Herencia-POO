import org.junit.Test;


public class PruebaEntidades {

	@Test
	public void conseguirFunciones(){
		
		Dueño dueño = new Dueño();
		Gerente gerente = new Gerente();
		Empleado empleado = new Empleado();
	
		gerente.setNombreGerente("Arnaldo Gi");
		gerente.getNombreGerente();
		gerente.setCantidadEmpleados(29);
		gerente.getCantidadEmpleados();
		gerente.setDepedir(true);
		gerente.depedir();
		gerente.getCantidadEmpleados();
		gerente.setDomicilioEmpresa("Palermo");
		gerente.getDomicilioEmpresa();
		
		empleado.setPuesto("soldador");
		empleado.getNombreGerente();
		empleado.setDomicilioEmpresa("Palermo");
		empleado.getDomicilioEmpresa();
		empleado.setSueldo(200.00);
		empleado.getSueldo();
		
		dueño.setDepedir(true);
		dueño.setNombreDueño("DeLider");
		dueño.getNombreDueño();
	
		
	}
}
