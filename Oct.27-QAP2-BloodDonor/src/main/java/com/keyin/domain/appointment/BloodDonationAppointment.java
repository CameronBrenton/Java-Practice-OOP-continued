/*
 * This is the BloodDonationAppointment class
 */
package com.keyin.domain.appointment;

// imports
import com.keyin.donor.BloodDonor;

import java.time.LocalDate;
import java.time.LocalTime;

public class BloodDonationAppointment extends BloodDonor {
    // instance variables
    private int appointmentID;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private LocalTime appointmentDuration;
    private String location;
    private String bloodType;
    private boolean fistTimeDonor;
    private int donorID;

    // Default constructor
    public BloodDonationAppointment() {
        appointmentID = 0;
        this.appointmentDate = LocalDate.now();
        this.appointmentTime = LocalTime.of(0,0);
        this.appointmentDuration = LocalTime.of(0,0);
        this.location = "";
        this.bloodType = "";
        this.fistTimeDonor = true;
        this.donorID = 0;
    }

    // Getters
    public int getAppointmentID() {
        return appointmentID;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public LocalTime getAppointmentDuration() {
        return appointmentDuration;
    }

    public String getLocation() {
        return location;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getDonorID() {
        return donorID;
    }

    public boolean isFistTimeDonor() {
        return fistTimeDonor;
    }

    // Setters
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public void setAppointmentDuration(LocalTime appointmentDuration) {
        this.appointmentDuration = appointmentDuration;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setFistTimeDonor(boolean fistTimeDonor) {
        this.fistTimeDonor = fistTimeDonor;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

}
