package java04;

import java.util.Scanner;

public class actividad1 {

	public static void main(String[] args) {
		//*EJERCICIOS
		//Ejercicio 1: Operadores Lógicos (&& y ||)
		//Indicación: Escribe un programa que tome dos valores booleanos a y b y verifique si ambos son true o al menos uno de ellos es true.
		//Imprime un mensaje adecuado para cada caso.
		
		boolean a = true;
	    boolean b = true;
	    
	    if( a||b ) {
	    	System.out.println("Al menos uno es verdad");
	    }else {
	    	System.out.println("Ambos son falsos");
	    }
	    
	    if (a && b) { 
	    	System.out.println("Ambos son verdaderos");
	    }else {
	    	System.out.println("Al menos uno es falso");
	    }
	    
	    
		//Ejercicio 2: Operadores Lógicos (!)
		//Indicación: Escribe un programa que tome un valor booleano c e invierta su valor usando el operador !. 
	    //Imprime el valor original y el invertido.
	    
	    boolean c = true;
	    boolean d = false;
	    
	        System.out.println("Los valores originales son:"  +  c + ","  + d);
	    
	    boolean f = !c; //Invierte los boluanos
	    boolean g = !d;
	      
	        System.out.println("Los valores ivertidos son:"   +  f  + "," +    g);
	    
		//Ejercicio 3 : Determinar si un número es positivo, negativo o cero
		//Indicación: Escribe un programa en Java que solicite al usuario ingresar un número entero. 
	    //Utiliza una estructura if-else para determinar si el número es positivo, negativo o cero. Imprime un mensaje adecuado para cada caso.
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Escribe un número entero entre -infinito e infinito:");
	          int numeroInf = scanner.nextInt();
	        if (numeroInf > 0){
	        	System.out.println(numeroInf  + " es positivo");
	        } else if (numeroInf < 0) {
	        	System.out.println(numeroInf + "  es negativo");
	        } else {
	        	System.out.println(numeroInf + " es cero");
	        }
	      
	      
		//Ejercicio 4: Sistema de Calificaciones
		//Indicación: Escribe un programa en Java que solicite al usuario ingresar una calificación en formato de letra (A, B, C, D, F).
	    //Utiliza una estructura switch para determinar el significado de la calificación y muestra un mensaje adecuado para cada caso 
	    //(A para "Excelente", B para "Bueno", etc.). Si se ingresa una letra diferente, imprime un mensaje indicando que la calificación es inválida.
	      
	       System.out.println("Escribe la calificación entre A, B, C y F para saber su significado");
	       int caliLet = scanner.next().toUpperCase().charAt(0);  // Leer la calificación como una cadena y convertir a un carácter
	       switch (caliLet) {
	       case 'A': 
	    	   System.out.println("Tu calificación es Excelente");
	    	   break;
	       case 'B':
	    	   System.out.println("Tu calificación es Buena");
	    	   break;
	       case 'C':
	    	   System.out.println("Tu calificación es Sufiente");
	    	   break;
	       case 'D':
	    	   System.out.println("Tu calificación es Insuficiente");
	    	   break;
	       case 'F':
	    	   System.out.println("Tu calificación es Reprobatoria");
	    	   break;
	       default: 
	    	   System.out.println("La calificación es inválida");
	    	   break;
	       }
	       
	      
		//Ejercicio 5: Gestión de Notificaciones en una Red Social
		//Indicación: Escribe un programa en Java que simule la gestión de notificaciones en una red social. 
	   //Solicita al usuario ingresar un número del 1 al 5 que representa diferentes tipos de notificaciones. 
	    //Utiliza una estructura switch para mostrar el mensaje correspondiente a cada tipo de notificación.
        
	       System.out.println("Ingresa un número de 1 al 5");
	       int notificacion = scanner.nextInt();
	       switch (notificacion) {
	       case 1:
	    	   System.out.println("Mensaje");
	    	   break;
	       case 2:
	    	   System.out.println("Comentario");
	    	   break;
	       case 3:
	    	   System.out.println("Me gusta");
	    	   break;
	       case 4:
	    	   System.out.println("Se compartio tu publicación");
	    	   break;
	       case 5:
	    	   System.out.println("Se guardo tu publicación");
	    	   break;
	       default:
	    	   System.out.println("No tienes notificaciones nuevas");
	    	   break;
	       }
	       
	}//metodo 

}
