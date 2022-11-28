package com.example.package_delivery.Dao;

import com.example.package_delivery.Entities.AdminEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminDaoTest {

    @Test
    void validateLogin() {
        AdminDao adminDao = new AdminDao();
        AdminEntity admin = adminDao.validateLogin("gliouinemahdi@gmail.com", "password");
        assertNotNull(admin);
    }
}