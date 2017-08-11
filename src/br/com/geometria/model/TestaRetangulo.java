package br.com.geometria.model;

public class TestaRetangulo {

	public static void main(String[] args) {
		Ponto p1 = new Ponto(3.8, -7.4);
        Ponto p2 = new Ponto();
        Reta r = new Reta(p1, p2);
        Retangulo retangulo = new Retangulo(r, new Reta(1.2, 5.8, 4.2, 0.0));
        System.out.println("Area do Retangulo: " + retangulo.getArea());
        System.out.println("Per�metro do Retangulo: " + retangulo.getPerimetro());
	}

}
