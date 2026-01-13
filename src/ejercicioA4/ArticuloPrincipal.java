package ejercicioA4;

public class ArticuloPrincipal {
	public static void main(String[] args) {
		Articulo articulo1 = new Articulo();
		articulo1.precio= 20;
		articulo1.nombre= "Mando";
		articulo1.cuantosQuedan=3;
		
		
		double precioFinal = (articulo1.precio * articulo1.IVA ) + articulo1.precio;
		
		System.out.println(articulo1.nombre + " tiene " + articulo1.cuantosQuedan + " en existencia y su precio final es " + precioFinal );
		
		
		//Cambiamos el precio
		
		articulo1.precio= 30;
		precioFinal = (articulo1.precio * articulo1.IVA ) + articulo1.precio;
		
		
		System.out.println("Cambio de precio");
		
		System.out.println(articulo1.nombre + " tiene " + articulo1.cuantosQuedan + " en existencia y su precio final es " + precioFinal );

		
		
	}
	
	
}
