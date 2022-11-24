package com.example.package_delivery.Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "vehicule", schema = "public", catalog = "delivery")
public class VehiculeEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @OneToOne(mappedBy = "vehicule")
    private DriverEntity driver;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DriverEntity getDriver() {
        return driver;
    }

    public void setDriver(DriverEntity driver) {
        this.driver = driver;
    }



}
