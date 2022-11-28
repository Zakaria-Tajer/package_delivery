package com.example.package_delivery.Dao;

import com.example.package_delivery.Entities.ManagerEntity;

import java.util.List;

public class ManagerDao extends AbstractHibernateDao<ManagerEntity> {
    public ManagerDao() {
        tableName = "manager";
        setClazz(ManagerEntity.class);
    }

    public List getAllManagers() {
        return findAll();
    }

}

