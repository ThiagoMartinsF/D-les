/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Produto;
import model.bean.Usuario;


public class ProdutoDAO {
    public List<Produto> read() {
        List<Produto> produto = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produtos = new Produto();                
                produtos.setIdProduto(rs.getInt("idProduto"));
                produtos.setNome(rs.getString("nome"));
                produtos.setCategoria(rs.getString("categoria"));
                produtos.setDescricao(rs.getString("descricao"));
                produtos.setPreco(rs.getFloat("preco"));
                produtos.setEstoque(rs.getInt("estoque"));
               
                
                produto.add(produtos);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produto;
                
    }
         
         
          public void create(Produto produto) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
           
            stmt = conexao.prepareStatement("INSERT INTO produto (nome, categoria, descriao, preco, estoque) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getCategoria());
            stmt.setString(3, produto.getDescricao());
            stmt.setFloat(4, (float) produto.getPreco());
            stmt.setInt(5, produto.getEstoque());
           
            
            
               stmt.executeUpdate();
               stmt.close();
               conexao.close();
               
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    
    
    public void delete(Produto produto) {
        try {
            java.sql.Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
           
            stmt = conexao.prepareStatement("DELETE FROM produto WHERE idUsuario = ?");
            stmt.setString(1, Integer.toString(produto.getIdProduto()));

            stmt.executeUpdate();
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "produto removido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Boolean login(Float preco, int estoque){
        Boolean validar = false;
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE preco = ?, estoque = ?");           
            stmt.setFloat(1, preco);
            stmt.setInt(2, estoque);
                 
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                validar = true;
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
        e.printStackTrace();
        }
        
         return null;
        
    }
    
    public void editar(Produto produto){
        try {
          Connection conexao = Conexao.conectar();
          PreparedStatement stmt = null;
          stmt = conexao.prepareStatement("UPDATE produto SET nome = ?, categoria = ?, descricao = ?, preco = ?, estoque = ? WHERE idUsuario = ?");
           stmt.setString(1, produto.getNome());
           stmt.setString(2, produto.getCategoria());
           stmt.setString(3, produto.getDescricao());
           stmt.setFloat(4, (float) produto.getPreco());
           stmt.setInt(5, produto.getEstoque());
                
          stmt.executeUpdate();
         
          stmt.close();
          conexao.close();
         
          
       } catch (SQLException e){
           
               e.printStackTrace();
       JOptionPane.showMessageDialog(null,"ProdutosDAO editar:" + e);
       
    }
        
   }
}
