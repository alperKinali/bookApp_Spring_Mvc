package com.example.bookapp.repository;

import com.example.bookapp.model.Reservation;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReservationRepository extends PagingAndSortingRepository<Reservation,Long> {


}
