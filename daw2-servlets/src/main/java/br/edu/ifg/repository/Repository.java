package br.edu.ifg.repository;

import java.util.List;

public interface Repository <T, I>{
	void salva(T t);
	void remove(T t);
	T get(I id);
	List<T> list();
}
