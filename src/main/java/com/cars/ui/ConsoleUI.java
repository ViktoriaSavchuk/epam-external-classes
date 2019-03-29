package com.cars.ui;

import com.cars.service.CarService;

public class ConsoleUI {

    private CarService carService;

    public ConsoleUI(CarService carService) {
        this.carService = carService;
    }

    public void showCarsBrandOf(String brand) {
        if (carService.findCarsBrandOf(brand).size() > 0) {
            System.out.println(brand+" cars");
            System.out.println(carService.findCarsBrandOf(brand)
                    .toString().replaceAll("^\\[|\\]$", "") +"\n");
        }else{
            System.out.printf("There are no %s cars %n%n", brand);
        }
    }

    public void showCarsOperatedMoreThan(int years) {
        if(carService.findCarsOperatedMoreThan(years).size()>0){
            System.out.printf("Cars operated more than %s years", years);
            System.out.println(carService.findCarsOperatedMoreThan(years)
                    .toString().replaceAll("^\\[|\\]$", "") +"\n");
        }else{
            System.out.printf("There are no cars witch operated more than %s years%n%n",years);
        }
    }

    public void showCarsByYearOfManufactureWithPriceMoreThen(int yearOfManufacture, int price) {
        if(carService.findCarsByYearOfManufactureWithPriceMoreThan(yearOfManufacture, price).size()>0){
            System.out.printf("Cars of %s, the price of which is more than %s", yearOfManufacture,price);
            System.out.println(carService.findCarsByYearOfManufactureWithPriceMoreThan(yearOfManufacture,price)
                    .toString().replaceAll("^\\[|\\]$", "") +"\n");
        }else {
            System.out.printf("There are no cars of %s and the price of which is more than %s%n",yearOfManufacture,price);
        }

    }
}
