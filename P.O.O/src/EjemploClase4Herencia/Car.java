package EjemploClase4Herencia;

public class Car extends Vehicle {
	private String modelName = "Mustang";
	
	
	public static void main(String[]args) {
		
		 Car myCar = new Car();
		 myCar.honk();
		 
		 
		 System.out.println(myCar.brand +" y "+ myCar.modelName);
		//hereda los atributos y metodos de Vehicle
		 
	}

}
