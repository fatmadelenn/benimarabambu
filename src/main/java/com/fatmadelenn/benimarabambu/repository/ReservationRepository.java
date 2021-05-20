package com.fatmadelenn.benimarabambu.repository;

import com.fatmadelenn.benimarabambu.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
