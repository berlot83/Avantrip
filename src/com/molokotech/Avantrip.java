package com.molokotech;

import java.util.ArrayList;
import java.util.List;

/*	1) Declare a total to loop
 *	2) Create a List<String> to add
 *	3) Loop into the total, from 1
 *	4) Validate if the current number is divisor from three, if it is add it to the list
 *	5) Validate if the current number is divisor from five, if it is add it to the list
 *	6) Parse the number not divisible by the other numbers and add it to the list
 **/


/* Ejercicio 1 */
public class Avantrip {
	static List<String> list = new ArrayList<>();

	public static List<String> implementFizzBuzz() {
		/* declare total and loop it */
		for (int i = 1; i <= 100; i++) {
			/* is divisible by 3? */
			if (i % 3 == 0) {
				list.add("Fizz");
			} 
			/* is divisible by 5? */
			else if (i % 5 == 0) {
				list.add("Buzz");
			}
			/* add the rest numbers */
			else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
	
	/* Ejercicio 2
	 * 
	 * Preguntas técnicas:
	 * A) La clase abstracta puede declarar métodos abstractos y no abstractos, la interfaz sólo abstractos.
	 *  la clase abstracta sólo puede extender una vez y de otra clase abstracta o no.
	 *  la interfaz tiene todos sus metodos public final.
	 *  la clase abstracta puede tener variables static final y métodos static final.
	 *  
	 *  B) Para configurar el servidor.
	 *  
	 *  c) Rest es un conjunto de prácticas pre establecidas para armar en forma eficiente y por convención un web service.
	 *  
	 *  d) Hablando de Rest desde el Client side se realizan llamadas y muestra un frontend, server side responde peticiones desde controladores.
	 *  
	 *  e) Se dan respuesta antes de llamar al método, variable etc, petición etc antes de arrancar la applicación y cuando se arranca se inyectan en un contenedor.
	 *  
	 *  f) 
	 *  
	 *  g) La labrer�as es un conjunto de archivos donde contienen líneas de código al cual se puede acceder, el framework es un conjunto íntegro de funciones que pueden implementar diferentes lenguajes y patrones de diseño.
	 *    
	 *  */
	
	public static void main(String[] args) {
		/* loop it and display it */
		for (String item : Avantrip.implementFizzBuzz()) {
			System.out.println(item);
		}
	}
}
