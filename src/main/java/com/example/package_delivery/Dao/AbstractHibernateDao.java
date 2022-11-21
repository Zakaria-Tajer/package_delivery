package com.example.package_delivery.Dao;

import com.example.package_delivery.utils.JpaService;

import java.io.Serializable;
import java.util.List;

public class AbstractHibernateDao<T extends Serializable> {
    private Class<T> clazz;

    protected String tableName;
    protected static JpaService jpaService = JpaService.getInstance();

    public void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(long id) {
        return jpaService.runInTransaction(entityManager ->
                entityManager.find(clazz, id));
    }

    public List findAll() {
        return jpaService.runInTransaction(entityManager ->
                entityManager.createQuery("from " + clazz.getName()).getResultList());
    }

    public boolean create(T entity) {
        jpaService.runInTransaction(entityManager -> {
            entityManager.persist(entity);
            return true;
        });
        return true;
    }

    public T update(T entity) {
        return jpaService.runInTransaction(entityManager ->
                entityManager.merge(entity));
    }

    public void delete(T entity) {
        jpaService.runInTransaction(entityManager -> {
            entityManager.remove(entity);
            return true;
        });
    }

    public void deleteById(long entityId) {
        T entity = findOne(entityId);
        delete(entity);
    }

    public boolean validate(T entity) {
        return jpaService.runInTransaction(entityManager -> {
            entityManager.persist(entity);
            return true;
        });
    }
}
