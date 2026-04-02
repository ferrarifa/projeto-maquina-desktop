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
    
        public void inserirPeca(PecasBean peca){
            try {
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = null;
                
                stmt = conn.prepareStatement("INSERT INTO pecas (nome, descricao, codigo_fabricante, tipo, material, compatibilidade, quantidade_estoque, preco, fornecedor) VALUES (?,?,?,?,?,?,?,?,?)");
                stmt.setString(1, peca.getNome());
                stmt.setString(2, peca.getDescricao() !=null ? peca.getDescricao() : "");
                stmt.setString(3, peca.getCodigo_fabricante() !=null ? peca.getCodigo_fabricante() : "");
                stmt.setString(4, peca.getTipo() !=null ? peca.getTipo(): "");
                stmt.setString(5, peca.getMaterial());
                stmt.setString(6, peca.getCompatibilidade() !=null ? peca.getCompatibilidade() : "");
                stmt.setInt(7, peca.getQuantidade_estoque());
                stmt.setDouble(8, peca.getPreco());
                stmt.setString(9, peca.getFornecedor() !=null ? peca.getFornecedor() : "");  
                
                
                stmt.executeUpdate();
                stmt.close();
                conn.close();
                
                
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    
        public void deletar(int id_peca){
            try{
                
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = null;
                
                stmt = conn.prepareStatement("DELETE FROM pecas WHERE id_peca = ?");
                stmt.setInt(1, id_peca);
                
                stmt.executeUpdate();
                stmt.close();
                conn.close();
                
                
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        
        public void atualizar(PecasBean peca){
            try{
                
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = null;
                
                stmt = conn.prepareStatement("UPDATE pecas SET nome = ?, descricao = ?, codigo_fabricante = ?, tipo = ?, material = ?, compatibilidade = ?, quantidade_estoque = ?, preco = ?, fornecedor = ? WHERE id_peca = ?");
                stmt.setString(1, peca.getNome());
                stmt.setString(2, peca.getDescricao());
                stmt.setString(3, peca.getCodigo_fabricante());
                stmt.setString(4, peca.getTipo());
                stmt.setString(5, peca.getMaterial());
                stmt.setString(6, peca.getCompatibilidade());
                stmt.setInt(7, peca.getQuantidade_estoque());
                stmt.setDouble(8, peca.getPreco());
                stmt.setString(9, peca.getFornecedor());
                stmt.setInt(10, peca.getId_pecas());
                
                stmt.executeUpdate();
                stmt.close();
                conn.close();
                
            }catch (SQLException e){
                e.printStackTrace();
            }
            
        }
        
        public PecasBean buscarPorId(int id) {

            String sql = "SELECT * FROM pecas WHERE id_peca = ?";

            try {

                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql); 

                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();

           if (rs.next()) {

                PecasBean p = new PecasBean();

                p.setId_pecas(rs.getInt("id_peca"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setCodigo_fabricante(rs.getString("codigo_fabricante"));
                p.setTipo(rs.getString("tipo"));
                p.setMaterial(rs.getString("material"));
                p.setCompatibilidade(rs.getString("compatibilidade"));
                p.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
                p.setPreco(rs.getDouble("preco"));
                p.setFornecedor(rs.getString("fornecedor"));

               return p;
            }

                stmt.close();
                conn.close();

                } catch (SQLException e) {
                e.printStackTrace();
                }

                return null;
                }
        
        public void atualizarQuantidade(int id, int quantidade) {
            
            String sql = "UPDATE pecas SET quantidade_estoque = ? WHERE id_peca = ?";

            try {
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);

                 stmt.setInt(1, quantidade);
                 stmt.setInt(2, id);
                 stmt.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
