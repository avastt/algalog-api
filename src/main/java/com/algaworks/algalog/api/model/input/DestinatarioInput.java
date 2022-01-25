package com.algaworks.algalog.api.model.input;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinatarioInput {

	@NotBlank
	@Column(name = "destinatario_nome")
	private String nome;
	
	@NotBlank
	@Column(name = "destinatario_logradouro")
	private String logradouro;
	
	@NotBlank
	@Column(name = "destinatario_numero")
	private String numero;
	
	@NotBlank
	@Column(name = "destinatario_complemento")
	private String complemento;
	
	@NotBlank
	@Column(name = "destinatario_bairro")
	private String bairro;
}
