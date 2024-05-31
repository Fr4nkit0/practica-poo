package Proyect;

public class MercadoPago implements Pago {

	@Override
	public double pagar(double monto) {
		return monto + (0.10*monto) ; 
	}

}
