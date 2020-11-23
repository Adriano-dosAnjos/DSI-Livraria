package br.edu.up.dao;

import java.util.List;

public interface DAO<T>{

	T incluir (T entidade);
	void excluir (Integer id);
	List<T> listar();
	T atualizar (T entidade);
	T buscarPorId(Integer id);
}
