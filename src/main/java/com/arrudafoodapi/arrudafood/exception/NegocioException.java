package com.arrudafoodapi.arrudafood.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class NegocioException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NegocioException(String mensagem) {
		super(mensagem);
	}
}
