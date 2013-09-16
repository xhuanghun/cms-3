package ru.bramblehorse.cms.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import ru.bramblehorse.cms.dao.AbstractDao;
import ru.bramblehorse.cms.model.TextContent;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bramblehorse
 * Date: 30.08.13
 * Time: 21:55
 * To change this template use File | Settings | File Templates.
 */

public class HibernateTextContentDao implements AbstractDao<TextContent> {
    @Autowired
    HibernateTemplate ht;

    @Override
    public void create(TextContent entity) {
        ht.save(entity);
    }

    @Override
    public void delete(TextContent entity) {
        ht.delete(entity);
    }

    @Override
    public void edit(TextContent entity) {
       ht.saveOrUpdate(entity);
    }

    @Override
    public TextContent getById(Integer id) {
        return ht.load(TextContent.class,id);
    }

    @Override
    public List<TextContent> getAll() {
        return ht.loadAll(TextContent.class);
    }
}