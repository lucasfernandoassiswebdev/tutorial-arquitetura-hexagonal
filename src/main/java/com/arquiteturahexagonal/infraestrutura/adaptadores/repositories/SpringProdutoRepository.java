package com.arquiteturahexagonal.infraestrutura.adaptadores.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arquiteturahexagonal.infraestrutura.adaptadores.entidades.ProdutoEntity;

@Repository
public interface SpringProdutoRepository extends JpaRepository<ProdutoEntity, UUID> {
	Optional<ProdutoEntity> findBySku(String sku);
}
