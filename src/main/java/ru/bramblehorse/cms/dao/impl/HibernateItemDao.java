package ru.bramblehorse.cms.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import ru.bramblehorse.cms.dao.AbstractDao;
import ru.bramblehorse.cms.model.commerce.Item;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bramblehorse
 * Date: 29.11.13
 * Time: 1:23
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class HibernateItemDao implements AbstractDao<Item> {

    @Autowired
    HibernateTemplate ht;

    @Transactional
    @Override
    public Integer create(Item entity) {

       return (Integer)ht.save(entity);
    }

    @Transactional
    @Override
    public void delete(Integer id) {

        Item temp = ht.load(Item.class, id);
        ht.delete(temp);
    }

    @Transactional
    @Override
    public void edit(Item entity) {

       ht.update(entity);
    }

    @Transactional
    @Override
    public Item getById(Integer id) {

        return ht.load(Item.class, id);
    }

    @Transactional
    @Override
    public List<Item> getAll() {

        return ht.loadAll(Item.class);
    }

}
