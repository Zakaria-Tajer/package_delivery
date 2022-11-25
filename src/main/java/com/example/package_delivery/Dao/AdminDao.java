package com.example.package_delivery.Dao;

import com.example.package_delivery.Entities.AdminEntity;
import com.example.package_delivery.helpers.HashPassword;

import java.util.List;

public class AdminDao extends AbstractHibernateDao<AdminEntity> {
    public AdminDao() {
        tableName = "admin";
        setClazz(AdminEntity.class);

    }

    public List getAllAdmins() {
        return findAll();
    }

    public boolean createAdmin(AdminEntity admin)  throws Exception {
        admin.setPassword(HashPassword.hashPassword(admin.getPassword()));
        return create(admin);
    }



    }



