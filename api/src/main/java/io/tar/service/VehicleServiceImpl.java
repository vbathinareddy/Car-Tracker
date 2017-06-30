package io.tar.service;

import io.tar.entity.Vehicle;
import io.tar.repository.VehicleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    public VehicleRespository repository;

    @Transactional
    public Vehicle create( Vehicle V) {
        Vehicle existing = repository.find(V.getVin());
        if(existing == null) {
            return repository.create(V);
        }
        return repository.update(V);

    }

}
