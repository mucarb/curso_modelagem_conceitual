package com.ribeiro.murilo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ribeiro.murilo.cursomc.domains.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
