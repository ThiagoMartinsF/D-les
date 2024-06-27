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

    public List<Produto> read(int id) {
        List<Produto> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto where id_categoria = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("Qtd"));
                produto.setImg(rs.getString("img"));
                produto.setId_categoria(rs.getInt("id_categoria"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produtos;

    }

    public List<Produto> read2() {
        List<Produto> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto");
           
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("Qtd"));
                produto.setImg(rs.getString("img"));
                produto.setId_categoria(rs.getInt("id_categoria"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produtos;

    }
    
    public void create(Produto produto) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO produto (nome, preco, descricao, img, qtd, id_categoria) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, produto.getNome());
            stmt.setFloat(2, produto.getPreco());
            stmt.setString(3, produto.getDescricao());
            stmt.setString(4, produto.getImg());
            stmt.setInt(5, produto.getQtd());
            stmt.setInt(6, produto.getId_categoria());

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

    public Boolean validaProduto(Float preco, int qtd) {
        Boolean validar = false;
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE preco = ?");
            stmt.setFloat(1, preco);

            rs = stmt.executeQuery();

            if (rs.next()) {
                validar = true;
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    public void editar(Produto produto) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement("UPDATE produto SET nome = ?, preco = ?, descricao = ?WHERE idUsuario = ?");
            stmt.setString(1, produto.getNome());
            stmt.setFloat(2, produto.getPreco());
            stmt.setString(4, produto.getDescricao());
            stmt.setInt(5, produto.getQtd());
            stmt.setInt(6, produto.getId_categoria());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ProdutosDAO editar:" + e);

        }

    }

    public Produto buscarProduto(int idProduto) {
        Produto produto = new Produto();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE  idProduto = ?");
            stmt.setInt(1, idProduto);

                rs = stmt.executeQuery();

            if (rs.next()) {
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setImg(rs.getString("img"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setId_categoria(rs.getInt("id_categoria"));
            } else {
                produto.setIdProduto(0);
            }
        } catch (SQLException e) {
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
            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE nome LIKE ? OR descricao LIKE ?");
            stmt.setString(1, "%" + busca + "%");
            stmt.setString(2, "%" + busca + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto prod = new Produto();
                prod.setIdProduto(rs.getInt("idProduto"));
                prod.setNome(rs.getString("nome"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setPreco(rs.getFloat("preco"));
                prod.setImg(rs.getString("img"));
                prod.setQtd(rs.getInt("qtd"));
                prod.setId_categoria(rs.getInt("id_categoria"));

                resultadoBusca.add(prod);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return resultadoBusca;
    }

    public List<Produto> buscaCategoria(int categoria) {
        List<Produto> produto = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto WHERE categoria = ?");
            stmt.setInt(1, categoria);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produtos = new Produto();
                produtos.setIdProduto(rs.getInt("idProduto"));
                produtos.setNome(rs.getString("nome"));
                produtos.setPreco(rs.getFloat("preco"));
                produtos.setDescricao(rs.getString("descricao"));
                produtos.setQtd(rs.getInt("qtd"));
                produtos.setImg(rs.getString("img"));
                produtos.setId_categoria(rs.getInt("id_categoria"));

                produto.add(produtos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }
}
