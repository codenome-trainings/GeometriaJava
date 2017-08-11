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
public class Ponto {
    
    private Double x;
    private Double y;

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Ponto(Ponto p1, Ponto p2) {
        
    }
    
    public String localizarNoPlano() {
        if (this.x > 0 && this.y > 0) {
            return "1º Quadrante";
        } else if (this.x < 0 && this.y > 0) {
            return "2º quadrante";
        } else if (this.x < 0 && this.y < 0) {
            return "3º quadrante";
        } else if (this.x > 0 && this.y < 0) {
            return "4º quadrante";
        } else if (this.x == 0) {
            return "Ponto no eixo de X";
        } else if (this.y == 0) {
            return "Ponto no eixo de Y";
        } else {
            return "Ponto na origem";
        }
    }
    
    public Double getDistancia(Ponto p) {
        return Math.sqrt(Math.pow(this.x-p.getX(),2) + Math.pow(this.y-p.getY(), 2));
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
    
    
    
}
