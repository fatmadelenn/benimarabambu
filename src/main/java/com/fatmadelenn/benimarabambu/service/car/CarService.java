package com.fatmadelenn.benimarabambu.service.car;

import com.fatmadelenn.benimarabambu.entity.Car;
import com.fatmadelenn.benimarabambu.exception.NotFoundException;
import com.fatmadelenn.benimarabambu.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private static final Logger logger = LoggerFactory.getLogger(CarService.class);

    @Autowired
    private CarRepository carRepository;

    public Car save(Car car) {
        Optional<Car> carOptional = carRepository.findById(car.getId());
        carOptional.ifPresent(value ->{
            car.setId(value.getId());
        });
        carRepository.save(car);
        logger.info("Successfully saved car: {}", car);
        return car;
    }

    public void delete(Long id) {
        Car car = carRepository.findById(id).orElseThrow(()-> new NotFoundException("Car not found"));
        carRepository.delete(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCar(Long id) {
        return carRepository.findById(id).orElseThrow(()-> new NotFoundException("Car not found"));
    }
}
