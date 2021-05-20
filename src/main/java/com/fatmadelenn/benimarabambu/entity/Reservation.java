package com.fatmadelenn.benimarabambu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Consumer consumer;

    @ManyToOne
    @JsonIgnore
    private Car car;

    @NotNull
    private String cost;

    @NotNull
    private int sumDay;

    @NotNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime endDate;

    private LocalDateTime receivedDate;

    @NotNull
    private boolean isPaid;

    @NotNull
    private boolean isDelivered;

    @NotNull
    private long givenKM;

    @NotNull
    private long receivedKM;

    @NotNull
    private String filePath;

    @NotNull
    private String note;

    public Reservation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getSumDay() {
        return sumDay;
    }

    public void setSumDay(int sumDay) {
        this.sumDay = sumDay;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public long getGivenKM() {
        return givenKM;
    }

    public void setGivenKM(long givenKM) {
        this.givenKM = givenKM;
    }

    public long getReceivedKM() {
        return receivedKM;
    }

    public void setReceivedKM(long receivedKM) {
        this.receivedKM = receivedKM;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", consumer=" + consumer +
                ", car=" + car +
                ", cost='" + cost + '\'' +
                ", sumDay=" + sumDay +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", receivedDate=" + receivedDate +
                ", isPaid=" + isPaid +
                ", isDelivered=" + isDelivered +
                ", givenKM=" + givenKM +
                ", receivedKM=" + receivedKM +
                ", filePath='" + filePath + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
