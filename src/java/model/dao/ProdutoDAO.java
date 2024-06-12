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
                produtos.setPreco(rs.getFloat("preco"));
                produtos.setCategoria(rs.getInt("categoria"));
                produtos.setDescricao(rs.getString("descricao"));
                produtos.setQtd(rs.getInt("Qtd"));
                produtos.setImg(rs.getString("img"));
               
                
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
           
            stmt = conexao.prepareStatement("INSERT INTO produto (nome, preco, categoria, descricao, img, qtd) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, produto.getNome());
            stmt.setFloat(2, produto.getPreco());
            stmt.setInt(3, produto.getCategoria());
            stmt.setString(4, produto.getDescricao());
            stmt.setString(5, produto.getImg());
            stmt.setInt(6, produto.getQtd());
            
           
           
            
            
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
    
    public Boolean validaProduto(Float preco, int qtd){
        Boolean validar = false;
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE preco = ?");           
            stmt.setFloat(1, preco);
            
                 
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
          stmt = conexao.prepareStatement("UPDATE produto SET nome = ?, preco = ?, categoria = ?, descricao = ?WHERE idUsuario = ?");
           stmt.setString(1, produto.getNome());
           stmt.setFloat(2, produto.getPreco());
           stmt.setInt(3, produto.getCategoria());
           stmt.setString(4,  produto.getDescricao());
           stmt.setInt(5, produto.getQtd());
         
                
          stmt.executeUpdate();
         
          stmt.close();
          conexao.close();
         
          
       } catch (SQLException e){
           
               e.printStackTrace();
       JOptionPane.showMessageDialog(null,"ProdutosDAO editar:" + e);
       
    }
        
   }
    
    public Produto buscarProduto(int idProduto) {
        Produto produto = new Produto();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE  id_produto = ?");
            stmt.setInt(1, idProduto);
            
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setImg(rs.getString("img"));
                produto.setQtd(rs.getInt("qtd"));
            } else {
                produto.setIdProduto(0);
            }
        } catch(SQLException e ) {
            e.printStackTrace();
        }
        
        return produto;
    }
    
    public List<Produto> buscaProdutos(String busca) {
        List<Produto> resultadoBusca = new ArrayList();

        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE nome LIKE ? OR descricao LIKE ?");
            stmt.setString(1, busca);
            stmt.setString(2, busca);
            
            rs = stmt.executeQuery();
        
            while(rs.next()) {
                Produto prod = new Produto();
                prod.setIdProduto(rs.getInt("idProduto"));
                prod.setNome(rs.getString("nome"));
                prod.setCategoria(rs.getInt("categoria"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setPreco(rs.getFloat("preco"));
                prod.setImg(rs.getString("img"));
                prod.setQtd(rs.getInt("qtd"));
                
                resultadoBusca.add(prod);
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        return resultadoBusca;
    }
    
    public List<Produto> buscaCategoria (int categoria) {
        List<Produto> produto = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE categoria = ?");
            stmt.setInt(1, categoria);
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produto produtos = new Produto();
                produtos.setIdProduto(rs.getInt("idProduto"));
                produtos.setNome(rs.getString("nome"));
                produtos.setPreco(rs.getFloat("preco"));
                produtos.setCategoria(rs.getInt("categoria"));
                produtos.setDescricao(rs.getString("descricao"));
                produtos.setQtd(rs.getInt("qtd"));
                produtos.setImg(rs.getString("img"));
               
                
                produto.add(produtos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }
}
