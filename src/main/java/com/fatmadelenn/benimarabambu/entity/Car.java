package com.fatmadelenn.benimarabambu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fatmadelenn.benimarabambu.service.car.CarVitesType;
import com.fatmadelenn.benimarabambu.service.car.TireType;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String brand;

    private String model;

    private String plaka;

    private String carClass;

    private CarVitesType vitesType;

    private String cost;

    private TireType tireType;

    private String description;

    private String notes;

    @Column(length = 300000)
    @NotNull
    private String carImage;

    @OneToMany(mappedBy = "car", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Reservation> carReservation;

    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    private Map<String, String> carAttribute = Maps.newHashMap(ImmutableMap.<String, String>builder()
            .put("day", "500 TL")
            .put("week", "3500 TL")
            .put("15 day", "10000 TL")
            .put("30 day", "30000 TL")
            .put("person", "5")
            .put("luggage", "2")
            .put("fuel", "LPG")
            .build());

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public CarVitesType getVitesType() {
        return vitesType;
    }

    public void setVitesType(CarVitesType vitesType) {
        this.vitesType = vitesType;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public TireType getTireType() {
        return tireType;
    }

    public void setTireType(TireType tireType) {
        this.tireType = tireType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCarImage() {
        return carImage;
    }

    public void setCarImage(String carImage) {
        this.carImage = carImage;
    }

    public List<Reservation> getCarReservation() {
        return carReservation;
    }

    public void setCarReservation(List<Reservation> carReservation) {
        this.carReservation = carReservation;
    }

    public Map<String, String> getCarAttribute() {
        return carAttribute;
    }

    public void setCarAttribute(Map<String, String> carAttribute) {
        this.carAttribute = carAttribute;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plaka='" + plaka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", vitesType=" + vitesType +
                ", cost='" + cost + '\'' +
                ", tireType=" + tireType +
                ", description='" + description + '\'' +
                ", notes='" + notes + '\'' +
                ", carImage='" + carImage + '\'' +
                ", carReservation=" + carReservation +
                ", carAttribute=" + carAttribute +
                '}';
    }
}
