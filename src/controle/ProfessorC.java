/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import BancoDeDados.BD;
import java.sql.ResultSet;
import modelo.ProfessorM;
/**
 *
 * @author Marcos
 */
public class ProfessorC {
    BD bd = new BD();
    String sql;
    ResultSet consulta;

    public void atualizarProfessor(ProfessorM professor){
        try{
            bd.abrirConexao();
            this.sql = "UPDATE professor SET nome_professor = '"+professor.getNome()+"', cod_professor = "+professor.getCodigo()+", coordenador = '"+professor.getCoord()+"' WHERE cod_professor = "+professor.getCodigo();
            bd.getStatement().execute(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void salvarProfessor(ProfessorM professor){
        try{
            bd.abrirConexao();
            this.sql = "INSERT INTO professor VALUES ("+professor.getCodigo()+",'"+professor.getNome()+"','"+professor.getCoord()+"')";
            bd.getStatement().execute(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public ResultSet buscarProfessorCodigo(int codigo){
        try{
            bd.abrirConexao();
            this.sql = "SELECT * FROM professor WHERE cod_professor = "+codigo;
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
            this.sql = "DELETE FROM professor WHERE cod_professor = "+codigo;
            bd.getStatement().executeQuery(this.sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    public ResultSet buscarProfessor(){
        try{
            bd.abrirConexao();
            String sql = "SELECT * FROM professor ORDER BY cod_professor";
            consulta = bd.getStatement().executeQuery(sql);
            bd.fecharConexao();
        }catch(Exception e){
            System.out.println(e);
        }
        return consulta;
    }
}
