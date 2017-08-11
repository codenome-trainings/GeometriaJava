package br.com.geometria.model;

public class TestaRetangulo {

	public static void main(String[] args) {
		Ponto p1 = new Ponto(3.8, -7.4);
        Ponto p2 = new Ponto();
        Reta r = new Reta(p1, p2);
        Reta r2 = new Reta(p1, p2);
        Retangulo retangulo = new Retangulo(r, r2);
        System.out.println("Area do Retangulo: " + retangulo.getArea());
        System.out.println("Perímetro do Retangulo: " + retangulo.getPerimetro());
	}

}
