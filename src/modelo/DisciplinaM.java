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
public class DisciplinaM {
    
    private int codigo;
    private String nome;
    private int CH;
    private int semestre;
    private String prof;

    public DisciplinaM(int codigo, String nome, int CH, int semestre, String prof) {
        this.codigo = codigo;
        this.nome = nome;
        this.CH = CH;
        this.semestre = semestre;
        this.prof = prof;
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

    public int getCH() {
        return CH;
    }

    public void setCH(int CH) {
        this.CH = CH;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }
    
    
}
