package com.ribeiro.murilo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ribeiro.murilo.cursomc.domains.Cliente;
import com.ribeiro.murilo.cursomc.repositories.ClienteRepository;
import com.ribeiro.murilo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository ClienteRepository;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = ClienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id +
				", Tipo: " + Cliente.class.getName()));
	}
	
}
