package com.fatmadelenn.benimarabambu.repository;

import com.fatmadelenn.benimarabambu.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
