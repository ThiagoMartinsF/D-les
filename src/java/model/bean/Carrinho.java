package model.bean;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class Carrinho {

    private int idCarrinho;
    private int id_usuario;
    private int id_produto;

    public Carrinho() {
    }

    public Carrinho(int idCarrinho, int id_usuario, int id_produto) {
        this.idCarrinho = idCarrinho;
        this.id_usuario = id_usuario;
        this.id_produto = id_produto;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }
    
    
}
