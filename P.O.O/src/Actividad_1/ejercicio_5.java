package Actividad_1;

public class ejercicio_5 {
    public static void main(String[] args) {
        double suma = 0;
        double x = 20;
        suma = suma + x;
        double y = 40;
        x = x + (y * y);
        suma = suma + (x / y);
        System.out.println("El valor de la suma es: " + suma);
    }
}