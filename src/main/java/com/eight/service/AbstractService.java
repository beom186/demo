package com.eight.service;

import com.eight.exception.EightTypeException;
import com.eight.exception.NoResourceException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;

public abstract class AbstractService<T, I> {

	private String entityClassName = "";
	
	public abstract JpaRepository<T, I> getRepository();

	protected abstract void onUpdateCalled(T entity, HashMap parameter) throws EightTypeException;
	
	public AbstractService() {
		entityClassName = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
	}
	
	public T findById(I id) throws NoResourceException {
		T entity = getRepository().findById(id).orElseThrow(() -> new NoResourceException(entityClassName, id));
		return entity;
    }
	
	public T findLastItem(String sortingColumn) {
		List<T> result = getRepository().findAll(PageRequest.of(0, 1, Sort.by(sortingColumn).descending())).getContent();
		if (result.isEmpty())
			return null;
		return result.get(0);
    }
	
	public List<T> findAll() {
		return findAll(null, Direction.ASC);
    }
	
	public List<T> findAll(String sortingColumn) {
		return findAll(sortingColumn, Direction.ASC);
    }
	
	public List<T> findAll(String sortingColumn, Direction direction) {
		Sort sort = null;
		if (sortingColumn != null) {
			sort = direction == Direction.ASC ? Sort.by(sortingColumn).ascending() : Sort.by(sortingColumn).descending();
		}
			
		List<T> result = sortingColumn != null
				? getRepository().findAll(PageRequest.of(0, 2048, sort)).getContent()
				: getRepository().findAll();
		return result;
    }
	
	public List<T> findAll(Pageable page) {
		Page<T> list = getRepository().findAll(page);
		return list.getContent();
    }
	
	@Transactional(rollbackFor = Exception.class)
	public T create(T parameter) throws EightTypeException {
		return getRepository().save(parameter);
    }
	
	@Transactional(rollbackFor = Exception.class)
	public T update(I id, HashMap parameter) throws EightTypeException {
		T entity = getRepository().findById(id).orElseThrow(() -> new NoResourceException(entityClassName, id));
		onUpdateCalled(entity, parameter);
		return entity;
    }
	
	@Transactional(rollbackFor = Exception.class)
	public void delete(I id) throws EightTypeException {
		T entity = getRepository().findById(id).orElseThrow(() -> new NoResourceException(entityClassName, id));
		getRepository().delete(entity);
    }
	
}
