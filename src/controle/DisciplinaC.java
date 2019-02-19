/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import BancoDeDados.BD;
import java.sql.ResultSet;
import modelo.DisciplinaM;

/**
 *
 * @author Marcos
 */
public class DisciplinaC {
    BD bd = new BD();
    String sql;
    ResultSet consulta;

    public void atualizarDisciplina(DisciplinaM disciplina){
        try{
            bd.abrirConexao();
            this.sql = "UPDATE disciplina SET nome = '"+disciplina.getNome()+"', cod_disciplina = '"+disciplina.getCodigo()+", cargaHoraria = '"+disciplina.getCH()+"', semestre = '"+disciplina.getSemestre()+"', professor = '"+disciplina.getProf()+"' WHERE cod_disciplina = "+disciplina.getCodigo();
            bd.getStatement().execute(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void salvarDisciplina(DisciplinaM disciplina){
        try{
            bd.abrirConexao();
            this.sql = "INSERT INTO disciplina VALUES ("+disciplina.getCodigo()+",'"+disciplina.getNome()+"','"+disciplina.getCH()+"', '"+disciplina.getSemestre()+"', '"+disciplina.getProf()+"')";
            bd.getStatement().execute(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public ResultSet buscarDisciplinaCodigo(int codigo){
        try{
            bd.abrirConexao();
            this.sql = "SELECT * FROM disciplina WHERE cod_disciplina = "+codigo;
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
            this.sql = "DELETE  FROM disciplina WHERE cod_disciplina = "+codigo;
            bd.getStatement().executeQuery(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public ResultSet buscarDisciplina(){
        try{
            bd.abrirConexao();
            this.sql = "SELECT * FROM disciplina ORDER BY cod_disciplina";
            consulta = bd.getStatement().executeQuery(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
        return consulta;
    }
}
