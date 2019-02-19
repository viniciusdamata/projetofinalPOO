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
public class GradeM {
    
    private int codigo;
    private int anoInicio;
    private String curso;
    private int cargaHoraria;
    private int nSemestre;
    private int chSemestre;

    public GradeM(int codigo, int anoInicio, String curso, int cargaHoraria, int nSemestre, int chSemestre) {
        this.codigo = codigo;
        this.anoInicio = anoInicio;
        this.curso = curso;
        this.cargaHoraria = cargaHoraria;
        this.nSemestre = nSemestre;
        this.chSemestre = chSemestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getnSemestre() {
        return nSemestre;
    }

    public void setnSemestre(int nSemestre) {
        this.nSemestre = nSemestre;
    }

    public int getChSemestre() {
        return chSemestre;
    }

    public void setChSemestre(int chSemestre) {
        this.chSemestre = chSemestre;
    }
    
    
}