package io.tar.repository;

import io.tar.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
public class VehicleRepositoryImpl implements VehicleRespository {
    @PersistenceContext
    private EntityManager entityManager;

    public Vehicle create(Vehicle V) {
        entityManager.persist(V);
        return V;
    }
    public Vehicle update(Vehicle V) {
        return entityManager.merge(V);
    }

    public Vehicle find(String vin) {
        return entityManager.find(Vehicle.class,vin);
    }
}

