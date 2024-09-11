package br.com.gabdev.dao;

import java.util.List;

import br.com.gabdev.dao.generic.IGenericDAO;
import br.com.gabdev.domain.Produto;

/**
 * @author gabdev
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
