package ru.bramblehorse.cms.service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bramblehorse
 * Date: 30.08.13
 * Time: 21:54
 * To change this template use File | Settings | File Templates.
 */
public interface AbstractService<T> {
    public Integer create(T entity);
    public void delete(Integer id);
    public void edit(T entity);
    public T getById(Integer id);
    public List<T> getAll();
}
