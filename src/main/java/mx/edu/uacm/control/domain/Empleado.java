package mx.edu.uacm.control.domain;

import mx.edu.uacm.control.constantes.CodigoError;

public class Empleado {
	
	
	public int registrarEmpleado(String nombre, String despacho, String puesto, int edad, double sueldoNeto, double retencion){
		
		if(!(nombre.matches("[A-Za-zÁ\\s]+")))
			return CodigoError.MAL_NOMBRE;
		
		return 1;
	}

}
