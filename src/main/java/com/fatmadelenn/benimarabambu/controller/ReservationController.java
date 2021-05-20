package com.fatmadelenn.benimarabambu.controller;

import com.fatmadelenn.benimarabambu.entity.Reservation;
import com.fatmadelenn.benimarabambu.service.reservation.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public Reservation save(Reservation reservation) {
        return reservationService.save(reservation);
    }

    @DeleteMapping(value = "{id:[0-9]+}")
    public void delete(Long id) {
        reservationService.delete(id);
    }

    @GetMapping("/all")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping(value = "{id:[0-9]+}")
    public Reservation getReservation(Long id) {
        return reservationService.getReservation(id);
    }
}
