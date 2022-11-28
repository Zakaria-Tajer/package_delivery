package com.example.package_delivery.Beans;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class DeliveryBean {

    private String weight;

    private String status;

    private String price;

    private String StartCity;

    private String EndCity;

    private String startDate;

    private String arrivalDate;

    private String deliveryManager;

    private String driver;



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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDeliveryManager() {
        return deliveryManager;
    }

    public void setDeliveryManager(String deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

}
