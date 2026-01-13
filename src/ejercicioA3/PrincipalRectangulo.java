package ejercicioA3;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rectangulo1 = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo();
		
		rectangulo1.x1=0;
		rectangulo1.y1=0;
		
		rectangulo1.x2=5;
		rectangulo1.y2=5;
		
		int ladoxR1 = Math.abs(rectangulo1.x1 - rectangulo1.x2 );
		int ladoyR1 = Math.abs(rectangulo1.y1 - rectangulo1.y2);
		int perimetroR1= ladoxR1 * 2 + ladoyR1 * 2;
		int areaR1= ladoxR1 * ladoyR1;
		
		
		
		
		rectangulo2.x1=7;
		rectangulo2.y1=9;
		
		rectangulo2.x2=2;
		rectangulo2.y2=3;
		
		int ladoxR2 = Math.abs(rectangulo2.x1 - rectangulo2.x2 );
		int ladoyR2 = Math.abs(rectangulo2.y1 - rectangulo2.y2);
		int perimetroR2= ladoxR2 * 2 + ladoyR2 * 2;
		int areaR2= ladoxR2 * ladoyR2;
		
		
		System.out.println("Cordenadas de rectangulo 1 : " + rectangulo1.x1 + "," + rectangulo1.x2 + " " + rectangulo1.y1 + "," + rectangulo1.y2 + " perimetro: " + perimetroR1 + " Area:" + areaR1 );

		System.out.println("Cordenadas de rectangulo 2 : " + rectangulo2.x1 + "," + rectangulo2.x2 + " " + rectangulo2.y1 + "," + rectangulo2.y2 + " perimetro:" + perimetroR2 + " Area:" + areaR2 );
		
		
		//Cambiamos los valores
		rectangulo1.x1=3;
		rectangulo1.y1=4;
		
		rectangulo1.x2=9;
		rectangulo1.y2=7;
		ladoxR1 = Math.abs(rectangulo1.x1 - rectangulo1.x2 );
		ladoyR1 = Math.abs(rectangulo1.y1 - rectangulo1.y2);
		perimetroR1= ladoxR1 * 2 + ladoyR1 * 2;
		areaR1= ladoxR1 * ladoyR1;
		
		
		//Rectangulo 2
		rectangulo2.x1=0;
		rectangulo2.y1=0;
		
		rectangulo2.x2=2;
		rectangulo2.y2=2;
		
		
		 ladoxR2 = Math.abs(rectangulo2.x1 - rectangulo2.x2 );
		 ladoyR2 = Math.abs(rectangulo2.y1 - rectangulo2.y2);
		 perimetroR2= ladoxR2 * 2 + ladoyR2 * 2;
		 areaR2= ladoxR2 * ladoyR2;
		
		
		System.out.println("Cordenadas de rectangulo 1 : " + rectangulo1.x1 + "," + rectangulo1.x2 + " " + rectangulo1.y1 + "," + rectangulo1.y2 + " perimetro: " + perimetroR1 + " Area:" + areaR1 );

		System.out.println("Cordenadas de rectangulo 2 : " + rectangulo2.x1 + "," + rectangulo2.x2 + " " + rectangulo2.y1 + "," + rectangulo2.y2 + " perimetro:" + perimetroR2 + " Area:" + areaR2 );
		
		


				


	}

}
