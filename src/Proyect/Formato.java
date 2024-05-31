package Proyect;

public abstract  class Formato {
	private Tipo tipo ; 
	public Formato (Tipo tipo) {
		this.tipo=tipo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	
}
