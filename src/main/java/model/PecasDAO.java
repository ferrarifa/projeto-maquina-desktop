/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class PecasDAO {
    
        public List<PecasBean> ler () {
            List<PecasBean> pecas = new ArrayList();
            try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM pecas");
            
            rs = stmt.executeQuery();
            while(rs.next()) {
                PecasBean peca = new PecasBean();
                peca.setId_pecas(rs.getInt("id_peca"));
                peca.setNome(rs.getString("nome"));
                peca.setDescricao(rs.getString("descricao"));
                peca.setCodigo_fabricante(rs.getString("codigo_fabricante"));
                peca.setTipo(rs.getString("tipo"));
                peca.setMaterial(rs.getString("material"));
                peca.setCompatibilidade(rs.getString("compatibilidade"));
                peca.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                peca.setPreco(rs.getDouble("preco"));
                peca.setFornecedor(rs.getString("fornecedor"));
                pecas.add(peca);
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return pecas;
        }
    
    
}
