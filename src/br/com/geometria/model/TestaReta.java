/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.geometria.model;

/**
 *
 * @author aluno
 */
public class TestaReta {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(3.8, -7.4);
        Ponto p2 = new Ponto();
        Reta r = new Reta(p1, p2);
        System.out.println("Comprimento: " + r.getComprimento());
        Reta r2 = new Reta(3.8, -7.4, 0.0, 0.0);
        System.out.println("Comprimento: " + r.getComprimento());
    }
}
