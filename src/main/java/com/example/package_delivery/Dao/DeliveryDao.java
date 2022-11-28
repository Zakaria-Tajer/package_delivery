package com.example.package_delivery.Dao;

import com.example.package_delivery.Entities.DeliveryEntity;

import java.util.List;

public class DeliveryDao extends AbstractHibernateDao<DeliveryEntity> {
    public DeliveryDao() {
        tableName = "delivery";
        setClazz(DeliveryEntity.class);
    }

    public List getAllDeliveries() {
        return findAll();
    }


}

