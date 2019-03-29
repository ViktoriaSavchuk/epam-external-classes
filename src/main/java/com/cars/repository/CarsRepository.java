package com.cars.repository;

import com.cars.entity.Car;

import java.util.*;

public class CarsRepository {

    private Set<Car> cars = new HashSet<>();

    public CarsRepository(Set<Car> cars) {
        this.cars = cars;
    }

    public CarsRepository() {
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Set<Car> getCars() {
        return cars;
    }

    public Car findCarById(Long carId) {
        for (Car car : cars) {
            if (carId.equals(carId)) return car;
        }
        return null;
    }

    public List<Car> findCarsBrandOf(String brand) {
        List<Car> carsOfBrand = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                carsOfBrand.add(car);
            }
        }
        return carsOfBrand;
    }

    public List<Car> findCarsByYearOfManufacture(int year){
        List<Car> carsOfBrand = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacture()==year) {
                carsOfBrand.add(car);
            }
        }
        return carsOfBrand;
    }

    @Override
    public String toString() {
        return "CarsRepository{" +
                "cars=" + cars +
                '}';
    }
}
