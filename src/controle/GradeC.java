/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import BancoDeDados.BD;
import java.sql.ResultSet;
import modelo.GradeM;

/**
 *
 * @author Marcos
 */
public class GradeC {
    BD bd = new BD();
    String sql;
    ResultSet consulta;

    public void atualizarGrade(GradeM grade){
        try{
            bd.abrirConexao();
            this.sql = "UPDATE grade SET cod_grade = "+grade.getCodigo()+", ano_inicio = "+grade.getAnoInicio()+", nome_curso= '"+grade.getCurso()+"', carga_horaria_geral = "+grade.getCargaHoraria()+", num_semestre = "+grade.getnSemestre()+", carga_horaria_semestral = "+grade.getChSemestre()+" WHERE cod_grade = "+grade.getCodigo();            
            bd.getStatement().execute(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void salvarGrade(GradeM grade){
        try{
            bd.abrirConexao();
            this.sql = "INSERT INTO grade VALUES ("+grade.getCodigo()+",'"+grade.getAnoInicio()+"','"+grade.getCurso()+"', '"+grade.getCargaHoraria()+"', '"+grade.getnSemestre()+"', '"+grade.getChSemestre()+"')";
            bd.getStatement().execute(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public ResultSet buscarGradeCodigo(int codigo){
        try{
            bd.abrirConexao();
            this.sql = "SELECT * FROM grade WHERE cod_grade = "+codigo;
            consulta = bd.getStatement().executeQuery(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
        return consulta;
    }

    public void deletarPorCodigo(int codigo){
        try{
            bd.abrirConexao();
            this.sql = "DELETE FROM grade WHERE cod_grade = "+codigo;
            bd.getStatement().executeQuery(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public ResultSet buscarGrade(){
        try{
            bd.abrirConexao();
            this.sql = "SELECT * FROM grade ORDER BY cod_grade";
            consulta = bd.getStatement().executeQuery(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
        return consulta;
    } 
}
