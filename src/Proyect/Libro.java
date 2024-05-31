package Proyect;

import java.util.ArrayList;

public class Libro {
	private static int id = 0 ; 
	private int isbn ; 
	private ArrayList <Autor> listAutor ; 
	private Formato formato ; 
	private double precioNominal ;
	public Libro(ArrayList<Autor> listAutor, Formato formato, double precioNominal) {
		id ++ ;
		this.isbn = id ; 
		this.listAutor = listAutor;
		this.formato = formato;
		this.precioNominal = precioNominal;
	} 
	public Libro( Formato formato, double precioNominal) {
		id ++ ;
		this.isbn = id ; 
		this.formato = formato;
		this.precioNominal = precioNominal;
	} 
	public ArrayList<Autor> getAutores (){
		return this.listAutor ; 
	}
	public Formato getFormato () {
		return this.formato ; 
	}
	public double getPrecio () {
		return switch (this.formato.getTipo()){
		case TAPA_DURA -> precioNominal + (0.20* precioNominal) ;
		case TAPA_BLANDA -> precioNominal ; 
		case MOBI -> precioNominal - (0.15 * precioNominal) ; 
		case PDF -> precioNominal + (0.25 * precioNominal) ;  
		case AZW3 -> precioNominal + (0.10 * precioNominal) ; 
		case EPUB -> precioNominal + (0.05 * precioNominal) ; 
		default -> throw new IllegalArgumentException("Unexpected value: " + this.formato.getTipo()); 
		};
	}
	public boolean equals (Libro otro ) {
		if (this.isbn==otro.isbn)
			return true ; 
		return false ; 
	}
}
