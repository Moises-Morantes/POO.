package Actividad_1;

public class ejercicio_12 {
	public static void main (String[]args) {
		int horas= 48;
		int vhora= 5000;
		float retencion =(float)12.5;
		int sabruto= horas*vhora;
		float vretencion=(sabruto*retencion)/100;
		float saneto= sabruto-vretencion;
		
		System.out.println("El valos del salario bruto es: "+ sabruto);
		System.out.println("El valos de la retencion es: "+ vretencion);;
		System.out.println("El valos del salario neto es: "+ saneto) ;
		}
}
