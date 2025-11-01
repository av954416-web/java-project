package com.carrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.carrental.model.Car;
import com.carrental.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getCars(@RequestParam(required = false) String search,
                             @RequestParam(required = false) Double minPrice,
                             @RequestParam(required = false) Double maxPrice,
                             @RequestParam(required = false) String brands,
                             @RequestParam(required = false) String carTypes,
                             @RequestParam(required = false) String transmission) {
        return carService.getFilteredCars(search, minPrice, maxPrice, brands, carTypes, transmission);
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable Long id) {
        return carService.getCarDetails(id);
    }

    @PostMapping
    public Car addCar(@RequestHeader("Authorization") String token, @RequestBody Car car) {
        return carService.addCar(token, car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@RequestHeader("Authorization") String token,
                         @PathVariable Long id,
                         @RequestBody Car car) {
        return carService.updateCar(token, id, car);
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@RequestHeader("Authorization") String token,
                            @PathVariable Long id) {
        carService.deleteCar(token, id);
        return "Car deleted successfully";
    }
}
