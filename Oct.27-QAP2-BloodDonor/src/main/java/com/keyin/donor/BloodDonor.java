/*
 * This is the BloodDonationAppointment class
 */
package com.keyin.donor;

// imports
import java.time.LocalDate;

public class BloodDonor{
    // instance variables
    private int donorID;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String bloodType;
    private LocalDate nextAppointment;
    private LocalDate lastDonationDate;

    // Default no-arg constructor
    public BloodDonor(){
        super();
        this.donorID = 0;
        this.firstName = "";
        this.lastName = "";
        this.dateOfBirth = LocalDate.now();
        this.bloodType = "";
        this.nextAppointment = LocalDate.now();
        this.lastDonationDate = LocalDate.now();
    }

    // Parameterized constructor
    public BloodDonor(int donorID, String firstName, String lastName, LocalDate dateOfBirth, String bloodType, LocalDate nextAppointment, LocalDate lastDonationDate){
        this();
        this.donorID = donorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bloodType = bloodType;
        this.nextAppointment = nextAppointment;
        this.lastDonationDate = lastDonationDate;
    }


    // Getters
    public int getDonorID(int donorID) {
        return donorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBloodType() {
        return bloodType;
    }

    public LocalDate getNextAppointment() {
        return nextAppointment;
    }

    public LocalDate getLastDonationDate() {
        return lastDonationDate;
    }

    // Setters
    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setNextAppointment(LocalDate nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public void setLastDonationDate(LocalDate lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }
}
