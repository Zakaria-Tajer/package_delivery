package com.example.package_delivery.Beans;


import com.example.package_delivery.Dao.AdminDao;
import com.example.package_delivery.Entities.AdminEntity;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class LoginBean {

    private String pwd;
    private String msg;
    private String email;

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    private String r = "eddededededeeddede";


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean checkUser() {
        AdminDao adminDao = new AdminDao();
        List<AdminEntity> adminEntitie = new ArrayList<>();
        if (adminDao.getAdminByEmail(email) != null) {
            adminEntitie.add(adminDao.getAdminByEmail(email));

        }
    }

}
