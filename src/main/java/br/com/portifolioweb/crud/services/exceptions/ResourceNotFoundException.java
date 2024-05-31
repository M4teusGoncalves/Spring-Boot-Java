package br.com.portifolioweb.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Usuário com ID " + id + " não localizado.");
	}

}
