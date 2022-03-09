package com.arquiteturahexagonal.dominio.portas.interfaces;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.arquiteturahexagonal.dominio.dtos.ProdutoDTO;
import com.arquiteturahexagonal.dominio.dtos.EstoqueDTO;

public interface ProdutoServicePort {

	List<ProdutoDTO> buscarProdutos();
	
	void criarProduto(ProdutoDTO produtoDTO);
	
	void atualizarEstoque(String sku, EstoqueDTO estoqueDTO) throws NotFoundException;
}
