package com.ribeiro.murilo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ribeiro.murilo.cursomc.domains.Categoria;
import com.ribeiro.murilo.cursomc.repositories.CategoriaRepository;
import com.ribeiro.murilo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id +
				", Tipo: " + Categoria.class.getName()));
	}
	
}
