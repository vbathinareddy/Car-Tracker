package io.tar.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@JsonAutoDetect
public class Readings {

    @Id
    @SequenceGenerator(name = "SEQ_GEN", sequenceName = "id_seq_gen",allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "SEQ_GEN", strategy = GenerationType.SEQUENCE)
    private Integer Id;
    private String vin;
    private Float latitude;
    private Float longitude;
    private Timestamp timestamp;
    private Float fuelVolume;
    private Integer speed;
    private Integer engineHp;
    private Boolean checkEngineLightOn;
    private Boolean engineCoolantLow;
    private Boolean cruiseControlOn;
    private Integer engineRpm;
    private Tires tires;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Float getLatitude() {return latitude;}

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp;}

    public Float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(Float fuelVolume) {this.fuelVolume = fuelVolume; }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(Integer engineHp) {
        this.engineHp = engineHp;
    }

    public Boolean getCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(Boolean checkEngineLightOn) {this.checkEngineLightOn = checkEngineLightOn;}

    public Boolean getEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(Boolean engineCoolantLow) {this.engineCoolantLow = engineCoolantLow;}

    public Boolean getCruiseControlOn() {return cruiseControlOn;}

    public void setCruiseControlOn(Boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public Integer getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(Integer engineRpm) {this.engineRpm = engineRpm;}

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {this.tires = tires;}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

}

