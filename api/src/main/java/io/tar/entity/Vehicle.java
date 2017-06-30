package io.tar.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

@Entity
@JsonAutoDetect
public class Vehicle {
    @Id
    private String vin;
    private String make;
    private String model;
    private Integer year;
    private Integer redlineRpm;
    private Integer maxFuelVolume;
    private Timestamp lastServiceDate;
    @OneToMany
    private List<Readings> readings;

    public List<Readings> getReadings() {
        return readings;
    }

    public void setReadings(List<Readings> readings) {
        this.readings = readings;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRedlineRpm() {
        return redlineRpm;
    }

    public void setRedlineRpm(Integer redlineRpm) {this.redlineRpm = redlineRpm;}

    public Integer getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(Integer maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public Timestamp getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(Timestamp lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

}
