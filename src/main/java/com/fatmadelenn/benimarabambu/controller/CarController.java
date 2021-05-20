package com.fatmadelenn.benimarabambu.controller;

import com.fatmadelenn.benimarabambu.entity.Car;
import com.fatmadelenn.benimarabambu.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    private Car save(@RequestBody Car car){
        return carService.save(car);
    }

    @DeleteMapping(value = "{id:[0-9]+}")
    private void delete(@PathVariable Long id){
        carService.delete(id);
    }

    @GetMapping("/all")
    private List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping(value = "{id:[0-9]+}")
    private Car getCar(@PathVariable Long id){
        return carService.getCar(id);
    }

}
