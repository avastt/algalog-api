package com.algaworks.algalog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.algalog.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algalog.domain.model.Entrega;
import com.algaworks.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscarEntregaService {

	@Autowired
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada!"));
		
	}

}
