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
public class TestePonto {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(3.8, -7.4);
        System.out.println("X de p1: " + p1.getX());
        System.out.println("Y de p1: " + p1.getY());
        System.out.println("Localização de p1: " + p1.localizarNoPlano());
        
        Ponto p2 = new Ponto();
        System.out.println("X de p2: " + p2.getX());
        System.out.println("Y de p2: " + p2.getY());
        System.out.println("Localização de p2: " + p2.localizarNoPlano());
        
        System.out.println("--------");
        System.out.println("Distancia de p1 para p2: " + p1.getDistancia(p2));
    }
}
