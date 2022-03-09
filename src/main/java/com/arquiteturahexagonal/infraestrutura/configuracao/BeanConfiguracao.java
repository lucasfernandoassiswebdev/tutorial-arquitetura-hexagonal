package com.arquiteturahexagonal.infraestrutura.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arquiteturahexagonal.dominio.adaptadores.services.PedidoServiceImp;
import com.arquiteturahexagonal.dominio.portas.interfaces.ProdutoServicePort;
import com.arquiteturahexagonal.dominio.portas.repositories.ProdutoRepositoryPort;

@Configuration
public class BeanConfiguracao {

	@Bean
	ProdutoServicePort produtoService(ProdutoRepositoryPort produtoRepositoryPort) {
		return new PedidoServiceImp(produtoRepositoryPort);
	}
}
