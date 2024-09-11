package br.com.gabdev.dao;

import java.util.List;

import br.com.gabdev.dao.generic.IGenericDAO;
import br.com.gabdev.domain.Cliente;

/**
 * @author gabdev
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
