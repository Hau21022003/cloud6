package com.ecommerce.model.dao;

import java.util.List;

public interface GenericDAO<E> {
	E create(E e);

	E update(E e);

	E get(Object id);

	void delete(Object id);

	List<E> listAll();

	long count();
}
