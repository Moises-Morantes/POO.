package Actividad_1;

//Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo. 
public class ejercicio_14 {
	public static void main(String[]args) {
		double num, cuadrado, cubo;
		num= 4;
		cuadrado = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		System.out.println("El cuadrado de "+ num +" es: " + cuadrado);
		System.out.println("El cubo de "+ num +" es: " + cubo );		
	}
	}
