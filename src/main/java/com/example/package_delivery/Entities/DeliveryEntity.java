package com.example.package_delivery.Entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "delivery", schema = "public", catalog = "delivery")
public class DeliveryEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "weight", nullable = false, length = 50)
    private String weight;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "price", nullable = false, length = 50)
    private String price;

    @Column(name = "startCity", nullable = false, length = 50)
    private String StartCity;

    @Column(name = "endCity", nullable = false, length = 50)
    private String EndCity;

    @Column(name = "startDate", nullable = false, length = 50)
    private LocalDateTime startDate;

    @Column(name = "arrivalDate", nullable = false, length = 50)
    private LocalDateTime arrivalDate;

    @ManyToOne (cascade = CascadeType.ALL)
    private DeliveryManagerEntity deliveryManager;

    @ManyToOne (cascade = CascadeType.ALL)
    private DriverEntity driver;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStartCity() {
        return StartCity;
    }

    public void setStartCity(String startCity) {
        StartCity = startCity;
    }

    public String getEndCity() {
        return EndCity;
    }

    public void setEndCity(String endCity) {
        EndCity = endCity;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public DeliveryManagerEntity getDeliveryManager() {
        return deliveryManager;
    }

    public void setDeliveryManager(DeliveryManagerEntity deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    public DriverEntity getDriver() {
        return driver;
    }

    public void setDriver(DriverEntity driver) {
        this.driver = driver;
    }


}
