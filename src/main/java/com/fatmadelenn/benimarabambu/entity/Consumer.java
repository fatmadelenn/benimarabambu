package com.fatmadelenn.benimarabambu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String tc;

    @Email
    private String mail;

    @Pattern(regexp="(^$|[0-9]{10})")
    private String telephone;

    @JsonIgnore
    @OneToMany(mappedBy = "consumer", fetch = FetchType.EAGER)
    private Set<Reservation> reservations;

    private long totalDebt;

    public Consumer(String fullName, String tc, @Email String mail, @Pattern(regexp = "(^$|[0-9]{10})") String telephone) {
        this.fullName = fullName;
        this.tc = tc;
        this.mail = mail;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public long getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(long totalDebt) {
        this.totalDebt = totalDebt;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", tc='" + tc + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone +
                '}';
    }
}
