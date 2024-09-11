package br.com.gabdev.service;

import java.util.List;

import br.com.gabdev.domain.Cliente;
import br.com.gabdev.exceptions.DAOException;
import br.com.gabdev.services.generic.IGenericService;

/**
 * @author gabdev
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
