package com.fatmadelenn.benimarabambu.service.consumer;

import com.fatmadelenn.benimarabambu.entity.Consumer;
import com.fatmadelenn.benimarabambu.entity.Reservation;
import com.fatmadelenn.benimarabambu.exception.NotFoundException;
import com.fatmadelenn.benimarabambu.repository.ConsumerRepository;
import com.fatmadelenn.benimarabambu.service.reservation.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);
    @Autowired
    private ConsumerRepository consumerRepository;

    public Consumer save(Consumer consumer) {
        Optional<Consumer> reservationOptional = consumerRepository.findById(consumer.getId());
        reservationOptional.ifPresent(value ->{
            consumer.setId(value.getId());
        });
        consumerRepository.save(consumer);
        logger.info("Successfully saved car: {}", consumer);
        return consumer;
    }

    public void delete(Long id) {
        Consumer reservation = consumerRepository.findById(id).orElseThrow(()-> new NotFoundException("Reservation not found"));
        consumerRepository.delete(reservation);
    }

    public List<Consumer> getAllConsumers() {
        return consumerRepository.findAll();
    }

    public Consumer getConsumer(Long id) {
        return consumerRepository.findById(id).orElseThrow(()-> new NotFoundException("Reservation not found"));
    }
}
