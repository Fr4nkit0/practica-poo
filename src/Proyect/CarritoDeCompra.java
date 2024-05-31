package Proyect;
import java.util.ArrayList;
public class CarritoDeCompra { 
	private ArrayList<Libro> listLibros ; 
	public CarritoDeCompra () {
		this.listLibros = new ArrayList<> ();
	}
	public void agregarLibro (Libro libro ) {
		this.listLibros.add(libro) ; 
	}
	public void eliminarLibro (Libro libro) {
		if (this.listLibros.isEmpty())
			System.out.println("No hay libro en el carrito ");
		int i = 0 ; 
		while (i<this.listLibros.size() && !this.listLibros.get(i).equals(libro)) {
			i++ ; 
		}
		if (i<this.listLibros.size())
			this.listLibros.remove(i) ; 
	}
	public double calcularTotal () {
		if (this.listLibros.isEmpty())
			return 0 ; 
		return  this.listLibros.stream().mapToDouble(Libro::getPrecio).sum() ;
	}
	public void pagar (TipoDePago tipoDePago) {
		if (this.listLibros.isEmpty()) 
			System.out.println("No Hay Libro") ; 
		Pago p = null ; 
		switch (tipoDePago) {
		case MERCADO_PAGO  :
			p = new MercadoPago () ; 
			break ; 
		case EFECTIVO: 
			p= new Efectivo () ; 
			break ; 
		case TARJETA_DE_CREDITO :
			p= new TarjetaDeCredito () ; 
			break ; 
		default:
			throw new IllegalArgumentException("Tipo de pago desconocido: " + tipoDePago);
			
		}
		double m = this.calcularTotal();
		System.out.println("Monto a pagar " + p.pagar(m));
	}
}
