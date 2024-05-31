package Proyect;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		CarritoDeCompra c = new CarritoDeCompra () ; 
		ArrayList <Autor> list = new ArrayList<Autor> () ; 
		list.add(AutorBuilder.crear().name("Carlitos")
				.goodreads("Facebook")
				.build()) ; 
		list.add(AutorBuilder.crear().name("Aylen")
				.goodreads("Google")
				.build()) ; 
		list.add(AutorBuilder.crear().name("Alejandro")
				.build()) ; 
		list.add(AutorBuilder.crear().name("Franco Calisaya")
				.build()) ; 
		c.agregarLibro(new Libro (list, new Digital (Tipo.PDF) , 526));
		c.agregarLibro(new Libro (new Papel (Tipo.TAPA_DURA) , 1250));
		c.agregarLibro(new Libro (new Papel (Tipo.TAPA_BLANDA) , 500));
		c.agregarLibro(new Libro ( new Digital (Tipo.EPUB) , 100));
		c.agregarLibro(new Libro ( new Digital (Tipo.MOBI) , 75));
		c.agregarLibro(new Libro ( new Digital (Tipo.AZW3) , 750));
		c.pagar(TipoDePago.TARJETA_DE_CREDITO);
		c.pagar(TipoDePago.MERCADO_PAGO);
		c.pagar(TipoDePago.EFECTIVO);
	}

}
