package com.nestdigital.flightmanagementbackend.dao;

import com.nestdigital.flightmanagementbackend.Model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlghtDao extends CrudRepository<FlightModel,Integer> {
}
