package com.example.package_delivery.Dao;

import com.example.package_delivery.Entities.DriverEntity;

import java.util.List;

public class DriverDao extends AbstractHibernateDao<DriverEntity> {
    public DriverDao() {
        tableName = "driver";
        setClazz(DriverEntity.class);
    }

    public List getAllDrivers() {
        return findAll();
    }

}

