package es.Studium.Intercambio;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, intercambio; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el numero 1");
		numero1 = teclado.nextInt();
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el numero 2");
		numero2 = teclado.nextInt();
		teclado.close();
		intercambio=numero2;
		numero2=numero1;
		numero1=intercambio;
		System.out.println("El número 1 es "+numero1+", el número2 es "+numero2);
	}

}
