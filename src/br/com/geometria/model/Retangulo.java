package br.com.geometria.model;

public class Retangulo extends Quadrado {
	
	private Reta altura;
	
	public Retangulo (Reta lado, Reta altura) {
		super(lado);
		this.altura = altura;
	}

	public Reta getAltura() {
		return altura;
	}
	
	@Override
	public Double getArea() {
		return this.altura.getComprimento() * super.lado.getComprimento();
	}
	
	@Override
	public Double getPerimetro() {
		return (this.altura.getComprimento() * 2) + (super.lado.getComprimento() * 2);
	}
	
}
