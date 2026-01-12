package ejercicioA2;

import java.util.Scanner;

public class PrincialPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		//Pedimos datos de la primera persona.
		System.out.println("Nombre de la primera persona");
		persona1.nombre = teclado.next();
		
		System.out.println("Apellidos de "  + persona1.nombre);
		persona1.apellidos=teclado.next();
		
		System.out.println("DNI de "  + persona1.nombre);
		persona1.dni=teclado.next();
		
		System.out.println("Edad de  "  + persona1.nombre);
		persona1.edad=teclado.nextInt();
		
		//Pedimos datos de la segunda persona
		System.out.println("Nombre de la segunda persona");
		persona2.nombre = teclado.next();
		
		System.out.println("Apellidos de "  + persona2.nombre);
		persona2.apellidos=teclado.next();
		
		System.out.println("DNI de "  + persona2.nombre);
		persona2.dni=teclado.next();
		
		System.out.println("Edad de  "  + persona2.nombre);
		persona2.edad=teclado.nextInt();
		
		
		persona1.mayorEdad = (persona1.edad > 18) ? true : false;
		persona2.mayorEdad = (persona2.edad > 18) ? true : false;
		
		
		if (persona1.mayorEdad) {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " es mayor de edad");
		}else {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " no es mayor de edad");
		}
		
		if (persona2.mayorEdad) {
			System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " es mayor de edad");
		}else {
			System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " no es mayor de edad");
		}
		
		
		
		
		
		
		
		

	}

}
