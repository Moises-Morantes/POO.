package EjemploClase4Herencia;

public class Vehicle {
	
	protected String brand ="Ford";
	
	public void honk() {            //metodo honk     
		System.out.println("Tuut, tuut!");
	}
	

}
// modificadores de acceso 


//Para heredar se definen con modificadores de acceso protected o public 
// privado es para utilizar dentro de una misma clase
// protected se puede utilizar en las clases que heredan de una super clase
// public lo pueden utilizar varias clase que esten dentro de un paquetez