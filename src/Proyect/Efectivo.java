package Proyect;

public class Efectivo implements Pago {

	@Override
	public double pagar(double monto) {
		return monto -( 0.20 * monto ) ;
	}

}
