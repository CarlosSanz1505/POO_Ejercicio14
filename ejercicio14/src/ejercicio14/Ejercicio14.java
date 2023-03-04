package ejercicio14;

import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        double num,cuadrado,cubo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = input.nextDouble();
        cuadrado = Math.pow(num,2);
        cubo = Math.pow(num,3);
        
        System.out.println("Su cuadrado es "+cuadrado+" y su cubo es "+cubo);
    }
    
}
