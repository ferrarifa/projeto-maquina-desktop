/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class PecasBean {
    
    private int id_pecas;
    private String nome;
    private String descricao;
    private String codigo_fabricante;
    private String tipo;
    private String material;
    private String compatibilidade;
    private int quantidade_estoque;
    private double preco;
    private String fornecedor;

    public PecasBean() {
    }

    public PecasBean(int id_pecas, String nome, String descricao, String codigo_fabricante, String tipo, String material, String compatibilidade, int quantidade_estoque, double preco, String fornecedor) {
        this.id_pecas = id_pecas;
        this.nome = nome;
        this.descricao = descricao;
        this.codigo_fabricante = codigo_fabricante;
        this.tipo = tipo;
        this.material = material;
        this.compatibilidade = compatibilidade;
        this.quantidade_estoque = quantidade_estoque;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public int getId_pecas() {
        return id_pecas;
    }

    public void setId_pecas(int id_pecas) {
        this.id_pecas = id_pecas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo_fabricante(String codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCompatibilidade() {
        return compatibilidade;
    }

    public void setCompatibilidade(String compatibilidade) {
        this.compatibilidade = compatibilidade;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setQuantidade(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}