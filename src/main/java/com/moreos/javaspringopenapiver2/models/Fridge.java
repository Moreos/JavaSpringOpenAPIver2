package com.moreos.javaspringopenapiver2.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Fridge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String countryOfManufacturer;
    private String firmOfManufacturer;
    private Boolean canOrderOnline;
    private Boolean canInstallments;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "fridge")
    private Set<FridgeModel> fridges;

    public Fridge() {}

    public Fridge(String name, String countryOfManufacturer, String firmOfManufacturer, Boolean canOrderOnline, Boolean canInstallments) {
        this.name = name;
        this.countryOfManufacturer = countryOfManufacturer;
        this.firmOfManufacturer = firmOfManufacturer;
        this.canOrderOnline = canOrderOnline;
        this.canInstallments = canInstallments;
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

    public String getCountryOfManufacturer() {
        return countryOfManufacturer;
    }

    public void setCountryOfManufacturer(String countryOfManufacturer) {
        this.countryOfManufacturer = countryOfManufacturer;
    }

    public String getFirmOfManufacturer() {
        return firmOfManufacturer;
    }

    public void setFirmOfManufacturer(String firmOfManufacturer) {
        this.firmOfManufacturer = firmOfManufacturer;
    }

    public Boolean getCanOrderOnline() {
        return canOrderOnline;
    }

    public void setCanOrderOnline(Boolean canOrderOnline) {
        this.canOrderOnline = canOrderOnline;
    }

    public Boolean getCanInstallments() {
        return canInstallments;
    }

    public void setCanInstallments(Boolean canInstallments) {
        this.canInstallments = canInstallments;
    }

    public Set<FridgeModel> getFridges() {
        return fridges;
    }

    public void setFridges(Set<FridgeModel> fridges) {
        this.fridges = fridges;
    }
}
