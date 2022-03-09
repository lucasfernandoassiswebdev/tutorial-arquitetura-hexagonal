package com.arquiteturahexagonal.dominio.portas.repositories;

import java.util.List;

import com.arquiteturahexagonal.dominio.Produto;

public interface ProdutoRepositoryPort {

	List<Produto> buscarTodos();

	Produto buscarPeloSku(String sku);

	void salvar(Produto produto);
}
