package br.com.gabdev.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.gabdev.dao.IProdutoDAO;
import br.com.gabdev.domain.Produto;
import br.com.gabdev.services.generic.GenericService;

/**
 * @author gabdev
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
