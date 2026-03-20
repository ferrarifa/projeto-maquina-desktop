/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class CadastroPecasBean {
    
    private int id;
    private int codigo;
    private String nome;
    private int quantidae;

    public CadastroPecasBean() {
    }

    public CadastroPecasBean(int id, int codigo, String nome, int quantidae) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.quantidae = quantidae;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidae() {
        return quantidae;
    }

    public void setQuantidae(int quantidae) {
        this.quantidae = quantidae;
    }
    
    
}
