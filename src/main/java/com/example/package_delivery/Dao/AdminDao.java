package com.example.package_delivery.Dao;

import com.example.package_delivery.Entities.AdminEntity;
import com.example.package_delivery.helpers.HashPassword;

import java.util.List;

import static com.example.package_delivery.utils.Security.checkPassword;

public class AdminDao extends AbstractHibernateDao<AdminEntity> {

    public AdminDao() {
        tableName = "admin";
        setClazz(AdminEntity.class);

    }

    public List getAllAdmins() {
        return findAll();
    }

    public AdminEntity getAdminById(long id) {
        return findOne(id);
    }

    public AdminEntity getAdminByEmail(String email) {
        return jpaService.runInTransaction(entityManager ->
                entityManager.createQuery("select a from AdminEntity a where a.email = :email", AdminEntity.class)
                        .setParameter("email", email)
                        .getSingleResult());
    }

    public AdminEntity validateLogin(String email, String password) {
        AdminEntity admin = getAdminByEmail(email);
        if (admin == null) {
            return null;
        }
        if (checkPassword(password, admin.getPassword())) {
            System.out.printf("success");
            return admin;
        } else {
            return null;
        }
    }

    public boolean createAdmin(AdminEntity admin) throws Exception {
        admin.setPassword(HashPassword.hashPassword(admin.getPassword()));
        return create(admin);
    }

    public AdminEntity updateAdmin(AdminEntity admin) {
        return update(admin);
    }

    public void deleteAdmin(AdminEntity admin) {
        delete(admin);

    }

    public void deleteAdminById(long id) {
        deleteById(id);

    }

    public static void main(String[] args) {
        AdminDao adminDao = new AdminDao();
//        validate the login
        AdminEntity admin = adminDao.validateLogin("gliouinemahdi0@gmail.com","admin");
        System.out.println(admin);

}

    }


