package com.arquiteturahexagonal.dominio;

import com.arquiteturahexagonal.dominio.dtos.ProdutoDTO;

import java.util.UUID;

public class Produto {

	private UUID codigo;
	private String sku;
	private String nome;
	private Double preco;
	private Double quantidade;
	
	public Produto() {
		super();
	}

	public Produto(UUID codigo, String sku, String nome, Double preco, Double quantidade) {
		super();
		this.codigo = codigo;
		this.sku = sku;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(ProdutoDTO produtoDTO) {		
		this.sku = produtoDTO.getSku();
		this.nome = produtoDTO.getNome();
		this.preco = produtoDTO.getPreco();
		this.quantidade = produtoDTO.getQuantidade();
	}

	public UUID getCodigo() {
		return codigo;
	}

	public String getSku() {
		return sku;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Double getQuantidade() {
		return quantidade;
	}
	
	public void atualizarEstoque(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public ProdutoDTO toProdutoDto() {
		return new ProdutoDTO(this.sku, this.nome, this.preco, this.quantidade);
	}
}
