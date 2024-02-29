package Actividad_1;
// Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y 
//la longitud de la circunferencia.
public class ejercicio_17 {
	public static void main (String[] args){
		double r= 4;
		double area,longitud;
		area=Math.PI*Math.pow(r, 2);
		longitud= 2 * Math.PI * r;
		System.out.println("El area del circulo es: "+ area);
		System.out.println("La longitud del circulo es: "+ longitud);
	}
}
