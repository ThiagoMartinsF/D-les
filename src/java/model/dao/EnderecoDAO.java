package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Endereco;

public class EnderecoDAO {

    public List<Endereco> getEnderecosByUsuarioId(int usuarioId) {
        List<Endereco> enderecos = new ArrayList<>();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM endereco WHERE idUsuario = ?");
            stmt.setInt(1, usuarioId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setIdEndereco(rs.getInt("idEndereco"));
                endereco.setCep(rs.getString("cep"));
                endereco.setRua(rs.getString("rua"));
                endereco.setNomeDestinatario(rs.getString("nomeDestinatario"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setId_usuario(rs.getInt("id_usuario"));
                enderecos.add(endereco);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return enderecos;
    }

    public void create(Endereco endereco) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO endereco (cep, rua, nomeDestinatario, numero, bairro, id_usuario) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, endereco.getCep());
            stmt.setString(2, endereco.getRua());
            stmt.setString(3, endereco.getNomeDestinatario());
            stmt.setInt(4, endereco.getNumero());
            stmt.setString(5, endereco.getBairro());
            stmt.setInt(6, endereco.getId_usuario());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Endereco endereco) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement("UPDATE endereco SET cep = ?, rua = ?, nomeDestinatario = ?, numero = ?, bairro = ?, id_usuario = ? WHERE id_endereco = ?");
            stmt.setString(1, endereco.getCep());
            stmt.setString(2, endereco.getRua());
            stmt.setString(3, endereco.getNomeDestinatario());
            stmt.setInt(4, endereco.getNumero());
            stmt.setString(5, endereco.getBairro());
            stmt.setInt(6, endereco.getId_usuario());
            stmt.setInt(7, endereco.getIdEndereco());

            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
