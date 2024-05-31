package Proyect;

public class TarjetaDeCredito implements Pago {

	@Override
	public double pagar(double monto) {
		return monto + 100 ;
	}

}
