package ejerciciosDeClase;

public class EjemploClase3 {
	
	
	public static void main(String[]args) {
		Estudiante estudiante1 = new Estudiante();
		estudiante1.apellido= "mendez";
		estudiante1.direccion= "calle 65";
		estudiante1.identificacion = 126543;
		estudiante1.nombre= "Jesus";
		estudiante1.telefono= 321223433;
		
		
		System.out.println("Identificacion:"+ estudiante1.identificacion);
		System.out.println("Telefono:"+ estudiante1.telefono);
	
		Empleado empleado1= new Empleado();
		empleado1.apellido = "Sosa";
		empleado1.sueldo = 3331;
		//se le pueden agregar todos los atributos de 
		//Estudiante ya que Empleado heredo los atributos de Estudiante
	
	
	}

}
