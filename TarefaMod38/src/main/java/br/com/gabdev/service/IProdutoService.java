package br.com.gabdev.service;

import java.util.List;

import br.com.gabdev.domain.Produto;
import br.com.gabdev.services.generic.IGenericService;

/**
 * @author gabdev
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
