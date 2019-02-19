/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Marcos
 */
public class ProfessorM {
    
    private int codigo;
    private String nome;
    private char coord;

    public ProfessorM(int codigo, String nome, char coord) {
        this.codigo = codigo;
        this.nome = nome;
        this.coord = coord;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getCoord() {
        return coord;
    }

    public void setCoord(char coord) {
        this.coord = coord;
    }
    
    
}
