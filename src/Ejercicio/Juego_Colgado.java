package Ejercicio;

import java.util.Scanner;

public class Juego_Colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in); 
	     
		// Aqui solicitare el numero de jugadores y rondas	       
		System.out.println("Bienvenidos al juego del Colgado");	        
		System.out.print("¿Cuántos jugadores quieren jugar? (el mínimo es 2): ");	        
		int numJugadores = x.nextInt();	       
		while (numJugadores < 2) {	        	
			System.out.print("Debe haber como minimo 2 jugadores. Intentalo otra vez: ");	           
			numJugadores = x.nextInt();
			
		}
	}

}
