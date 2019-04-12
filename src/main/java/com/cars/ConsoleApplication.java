package com.cars;

import com.cars.entity.Car;
import com.cars.repository.CarsRepository;
import com.cars.service.CarService;
import com.cars.ui.ConsoleUI;

public class ConsoleApplication {
    public static void main(String[] args) {

        CarsRepository carsRepository=new CarsRepository();

        Car car1=new Car(1L,"Mersedes", "Bens", 2008,"black",300000, "RF234HY" );
        Car car2=new Car(2L,"Hundai", "ix35", 2014,"red",200000, "HYT56FR2" );

        carsRepository.addCar(car1);
        carsRepository.addCar(car2);

        CarService carService= new CarService(carsRepository);
        ConsoleUI consoleUI=new ConsoleUI(carService);

        consoleUI.showCarsBrandOf("Hundai");
        consoleUI.showCarsBrandOf("BMW");
        consoleUI.showCarsOperatedMoreThan(2);
        consoleUI.showCarsByYearOfManufactureWithPriceMoreThen(2008, 200000);
        consoleUI.showCarsByYearOfManufactureWithPriceMoreThen(2015, 400000);
    }
}
