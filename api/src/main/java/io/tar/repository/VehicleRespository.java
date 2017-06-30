package io.tar.repository;

import io.tar.entity.Vehicle;

public interface VehicleRespository {
    Vehicle create(Vehicle V);
    Vehicle update(Vehicle V);
    Vehicle find(String vin);

}
