package br.com.condonnections.exception;

public class BadRequestResponseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BadRequestResponseException(String mensagem) {
        super(mensagem);
    }
}