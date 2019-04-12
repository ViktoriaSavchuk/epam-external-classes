package com.cars.service;

import com.cars.entity.Car;
import com.cars.repository.CarsRepository;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private CarsRepository carsRepository;

    public CarService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public List<Car> findCarsBrandOf(String brand) {
        return carsRepository.findCarsBrandOf(brand);
    }

    public List<Car> findCarsOperatedMoreThan(int years) {

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        return carsRepository.getCars().stream()
                .filter(car -> (currentYear-car.getYearOfManufacture()) >= years)
                .collect(Collectors.toList());
    }

    public List<Car> findCarsByYearOfManufactureWithPriceMoreThan(int yearOfManufacture, int price) {
        return carsRepository.findCarsByYearOfManufacture(yearOfManufacture).stream()
                .filter(car -> car.getYearOfManufacture() == yearOfManufacture & car.getPrice() >= price)
                .collect(Collectors.toList());
    }
}
