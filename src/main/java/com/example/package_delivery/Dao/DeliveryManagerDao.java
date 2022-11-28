package com.example.package_delivery.Dao;

import com.example.package_delivery.Entities.DeliveryManagerEntity;

import java.util.List;

public class DeliveryManagerDao extends AbstractHibernateDao<DeliveryManagerEntity> {
    public DeliveryManagerDao() {
        tableName = "delivery_manager";
        setClazz(DeliveryManagerEntity.class);
    }

    public List getAllDeliveryManagers() {
        return findAll();
    }


}
