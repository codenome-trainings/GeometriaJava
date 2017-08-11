package br.com.geometria.model;

public class TestaQuadrado {

	public static void main(String[] args) {
		Ponto p1 = new Ponto(3.8, -7.4);
        Ponto p2 = new Ponto();
        Reta r = new Reta(p1, p2);
        Quadrado q = new Quadrado(r);
        System.out.println("Área: " + q.getArea());
        System.out.println("Perímetro: " + q.getPerimetro());
        
	}

}
