package com.example.package_delivery.Entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "manager", schema = "public", catalog = "delivery")
public class ManagerEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "firstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    private AdminEntity admin;
//
    @OneToMany(mappedBy = "manager",fetch = FetchType.LAZY)
    private List<DeliveryManagerEntity> deliveryManagers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public AdminEntity getAdmin() {
//        return admin;
//    }
//
//    public void setAdmin(AdminEntity admin) {
//        this.admin = admin;
//    }
//
//    public List<DeliveryManagerEntity> getDeliveryManagers() {
//        return deliveryManagers;
//    }
//
//    public void setDeliveryManagers(List<DeliveryManagerEntity> deliveryManagers) {
//        this.deliveryManagers = deliveryManagers;
//    }

}
