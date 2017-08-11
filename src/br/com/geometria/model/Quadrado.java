package br.com.geometria.model;

public class Quadrado {
	
	protected Reta lado;
	
	public Quadrado(Reta lado) {
		this.lado = lado;
	}
	
	public Reta getLado() {
		return this.lado;
	}
	
	public Double getArea() {
		return Math.pow(this.lado.getComprimento(), 2);
	}
	
	public Double getPerimetro() {
		return this.lado.getComprimento() * 4;
	}
	
	
	
}
