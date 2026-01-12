package ejercicioA1;

public class PrincipalPunto {

	public static void main(String[] args) {
		Punto punto1 = new Punto();
		punto1.x=5;
		punto1.y=0;
		
		Punto punto2= new Punto();
		punto2.x=10;
		punto2.y=10;
		
		Punto punto3= new Punto();
		punto3.x= -3;
		punto3.y= 7;
		
		
		System.out.println("Valores originales");
		System.out.print(punto1.x + "," + punto1.y);
		System.out.println();
		
		System.out.print(punto2.x + "," + punto2.y);
		System.out.println();
		
		System.out.print(punto3.x + "," + punto3.y);
		System.out.println();
		
		//Modificamos los valores.
		
		punto1.x *= 3;
		punto1.y+= punto1.x;
		
		punto2.x= punto2.y + punto1.x;
		punto2.y += punto2.y + punto1.x * 3;
		
		punto3.x += -10;
		punto3.y *= 5;
		
		System.out.println();
		System.out.println("Valores Modificados");
		System.out.print(punto1.x + "," + punto1.y);
		System.out.println();
		
		System.out.print(punto2.x + "," + punto2.y);
		System.out.println();
		
		System.out.print(punto3.x + "," + punto3.y);
		System.out.println();
		
		

	}

}
