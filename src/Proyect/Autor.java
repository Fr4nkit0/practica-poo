package Proyect;

public class Autor {
	private String name ;
	private String goodreads ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoodreads() {
		return goodreads;
	}
	public void setGoodreads(String goodreads) {
		this.goodreads = goodreads;
	}
	@Override
	public String toString() {
		return "Name:" + name ;
	}
	
	
}
