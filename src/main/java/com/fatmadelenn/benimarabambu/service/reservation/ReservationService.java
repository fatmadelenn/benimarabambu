package com.fatmadelenn.benimarabambu.service.reservation;

import com.fatmadelenn.benimarabambu.entity.Reservation;
import com.fatmadelenn.benimarabambu.exception.NotFoundException;
import com.fatmadelenn.benimarabambu.repository.ReservationRepository;
import com.fatmadelenn.benimarabambu.service.consumer.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private static final Logger logger = LoggerFactory.getLogger(ReservationService.class);

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ConsumerService consumerService;

    public Reservation save(Reservation reservation) {
        Optional<Reservation> reservationOptional = reservationRepository.findById(reservation.getId());
        reservationOptional.ifPresent(value ->{
            reservation.setId(value.getId());
        });
        consumerService.save(reservation.getConsumer());
        reservationRepository.save(reservation);
        logger.info("Successfully saved car: {}", reservation);
        return reservation;
    }

    public void delete(Long id) {
        Reservation reservation = reservationRepository.findById(id).orElseThrow(()-> new NotFoundException("Reservation not found"));
        reservationRepository.delete(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id).orElseThrow(()-> new NotFoundException("Reservation not found"));
    }

}
