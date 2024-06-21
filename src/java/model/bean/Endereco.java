/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author pixel
 */
public class Endereco {

    private int idEndereco;
    private String cep;
    private String rua;
    private String nomeDestinatario;
    private int numero;
    private String bairro;
    private int id_usuario;

    public Endereco() {
    }

    public Endereco(int idEndereco, String cep, String rua, String nomeDestinatario, int numero, String bairro, int id_usuario) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.rua = rua;
        this.nomeDestinatario = nomeDestinatario;
        this.numero = numero;
        this.bairro = bairro;
        this.id_usuario = id_usuario;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;

    }
}
