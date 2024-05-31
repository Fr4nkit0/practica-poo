package Proyect;

public class AutorBuilder extends AbstractAutorBuilder {
	private Autor autor ; 
	private AutorBuilder () {
		this.autor= new Autor () ; 
	}
	public static AutorBuilder crear () {
		return new AutorBuilder () ; 
	}
	@Override
	public Autor build() {
		return this.autor ;
	}

	@Override
	public AbstractAutorBuilder name(String name) {
		this.autor.setName(name);
		return this;
	}

	@Override
	public AbstractAutorBuilder goodreads(String goodreads) {
		this.autor.setGoodreads(goodreads);
		return this;
	}

}
