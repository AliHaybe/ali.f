package com.hanaad.demo.Repository;

import com.hanaad.demo.Model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long> {

    Iterable<Object> findAll();
}
