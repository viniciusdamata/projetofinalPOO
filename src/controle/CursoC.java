/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import BancoDeDados.BD;
import java.sql.ResultSet;
import modelo.CursoM;

/**
 *
 * @author Marcos
 */
public class CursoC {
    BD bd = new BD();
    String sql;
    ResultSet consulta;

    public void atualizarCurso(CursoM curso){
        try{
            bd.abrirConexao();
            this.sql = "UPDATE curso SET nome_curso = '"+curso.getNome()+"', cod_curso = '"+curso.getCodigo()+"', turno = '"+curso.getTurma()+"' WHERE cod_curso = "+curso.getCodigo();
            bd.getStatement().execute(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void salvarCurso(CursoM curso){
        try{
            bd.abrirConexao();
            this.sql = "INSERT INTO curso VALUES ("+curso.getCodigo()+",'"+curso.getNome()+"','"+curso.getTurma()+"')";
            bd.getStatement().execute(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public ResultSet buscarCursoCodigo(int codigo){
        try{
            bd.abrirConexao();
            this.sql = "SELECT * FROM curso WHERE cod_curso = "+codigo;
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
            this.sql = "DELETE FROM curso WHERE cod_curso = "+codigo;
            bd.getStatement().executeQuery(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    public ResultSet buscarCurso(){
        try{
            bd.abrirConexao();
            String sql = "SELECT * FROM curso ORDER BY cod_curso";
            consulta = bd.getStatement().executeQuery(sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
        return consulta;
    }
}
