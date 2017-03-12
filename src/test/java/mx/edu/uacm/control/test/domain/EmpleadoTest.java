package mx.edu.uacm.control.test.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mx.edu.uacm.control.constantes.CodigoError;
import mx.edu.uacm.control.constantes.Puesto;
import mx.edu.uacm.control.domain.Empleado;

public class EmpleadoTest {
	
	@BeforeClass
	public static void configClase(){
		System.out.println("Before class");
	}
	
	@Before
	public void configMetodos(){
		System.out.println("Antes de cada metodo");
	}
	
	@Test
	public void registrarEmpleadoTest() {
		
		System.out.println("Entrando a registrarEmpleadoTest");
		Empleado empleado = new Empleado();
		String nombre = "lui3";
		String despacho = "A123";
		String puesto = Puesto.ANALISTA;
		int edad = 18;
		double sueldoNeto = 1000.0f;
		double retencion = 10.0f;
		int codigoError = empleado.registrarEmpleado(nombre, despacho, puesto, edad, sueldoNeto, retencion);
		System.out.println("Codigo error :" + codigoError);
		
		Assert.assertTrue(CodigoError.MAL_NOMBRE==codigoError);
		
	}
	
	@Test
	public void registrarEmpleadoTest2(){
		System.out.println("Entrando a registrarEmpleadoTest2");
	}

}
