package br.com.gabdev.domain;

/**
 * @author gabdev
 *
 * Classe que representa todas as entidades ou objetos da aplicação que seram salvas no banco de dados
 */
public interface Persistente {

	public Long getId();
	
	public void setId(Long id);
}
