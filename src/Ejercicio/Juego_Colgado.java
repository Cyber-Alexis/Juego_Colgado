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
		
		System.out.println("¿Cuántas rondas quereis jugar? ");  
	    int numrondas = x.nextInt();
	    x.nextLine();
		
	  //En este apartado haremos lo de la palabra secreta
	    System.out.print("Jugador 1, ingresa la palabra secreta: ");
	    String palabrasecreta = x.nextLine().toLowerCase();
	    char[] palabraadivinada = new char[palabrasecreta.length()];
	    for (int i = 0; i < palabrasecreta.length(); i++) {
	    	 palabraadivinada[i] = '_';  // Inicializaremos con varios guiones bajos	  
	    	 
	    }
	    //Pondremos un int como contador de rondas ganadas por jugador
	    int[] rondasGanadas = new int[numJugadores];
	    
	    // Rondas del juego
	    for (int ronda = 1; ronda <= numrondas; ronda++) {
	   
	    }
	    
	}

}
