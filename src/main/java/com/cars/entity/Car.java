package com.cars.entity;

public class Car {

    private Long carId;
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String colour;
    private Integer price;
    private String registrationNumber;


    public Car(Long carId,String brand, String model, int yearOfManufacture, String colour, Integer price, String registrationNumber) {
        this.carId=carId;
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.colour = colour;
        this.price=price;
        this.registrationNumber = registrationNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Long getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColour() {
        return colour;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return
                "\ncarId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber+"'" ;
    }
}
