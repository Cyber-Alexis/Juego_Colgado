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
	    	//Este apartado de rondas servira para indicar la ronda que esta en curso
	    	System.out.println("\n--- Ronda " + ronda + " ---"); 
	    	//En esta parte colocare un boolean para indicar si la palabra ha sido adivinada
	    	boolean palabraAdivinada = false;
	    	//Aqui colocare un array que guarda el numero de intentos de cada jugador
            int[] intentosrestantes = new int[numJugadores];
            
            //Aqui utilizare un for que buscara en el array los intentos restantes de cada jugador y que seran 6
            for (int i = 0; i < numJugadores; i++) {
                intentosrestantes[i] = 6;
            }
            // Comenzamos el juego por jugadores
            while (!palabraAdivinada) {
                for (int jugador = 0; jugador < numJugadores; jugador++) {
                    // Mostrar estado actual de la palabra
                    System.out.print("Palabra: ");
                    for (int i = 0; i < palabraadivinada.length; i++) {
                        System.out.print(palabraadivinada[i] + " ");  // Usamos un ciclo for tradicional
                    }
             
                    
                    System.out.println("Jugador " + (jugador + 1) + " te quedan " + intentosrestantes[jugador] + " intentos.");
                    System.out.print("Introduce una letra: ");
                    String letra = x.nextLine().toLowerCase();
            
                }
            }
	    }
	}
}
