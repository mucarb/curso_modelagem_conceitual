package com.ribeiro.murilo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ribeiro.murilo.cursomc.domains.Pedido;
import com.ribeiro.murilo.cursomc.repositories.PedidoRepository;
import com.ribeiro.murilo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository PedidoRepository;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = PedidoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id +
				", Tipo: " + Pedido.class.getName()));
	}
	
}
