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
import model.bean.Categoria;

/**
 *
 * @author Senai
 */
public class CategoriaDAO {
    public List<Categoria> listarCategorias() {
        List<Categoria> categoria = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM categoria");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Categoria categoriaAtual = new Categoria();
                categoriaAtual.setIdCategoria(rs.getInt("idCategoria"));
                categoriaAtual.setNome(rs.getString("nome"));
                
                categoria.add(categoriaAtual);
            }
        } catch(SQLException e) {
            
        }
        
        return categoria;
    }
}
