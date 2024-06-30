
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Carrinho;

public class CarrinhoDAO {
    private Connection connection;

    public CarrinhoDAO(Connection connection) {
        this.connection = connection;
    }


    public boolean adicionarItem(Carrinho carrinho) {
        String sql = "INSERT INTO carrinho (id_usuario, id_produto) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, carrinho.getId_usuario());
            stmt.setInt(2, carrinho.getId_produto());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean removerItem(int idCarrinho) {
        String sql = "DELETE FROM carrinho WHERE idCarrinho = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idCarrinho);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<Carrinho> listarItensPorUsuario(int idUsuario) {
        List<Carrinho> carrinhoItens = new ArrayList<>();
        String sql = "SELECT * FROM carrinho WHERE id_usuario = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idCarrinho = rs.getInt("idCarrinho");
                int idProduto = rs.getInt("id_produto");
                Carrinho carrinho = new Carrinho(idCarrinho, idUsuario, idProduto);
                carrinhoItens.add(carrinho);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carrinhoItens;
    }

}
