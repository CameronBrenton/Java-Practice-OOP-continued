/*
 * This is the AppointmentSlot class
 */
package com.keyin.domain.appointment;

// imports
import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentSlot extends BloodDonationAppointment{
    // instance variables
    private int slotID;
    private String location;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String bloodType;

    // Default no-arg constructor


    public AppointmentSlot() {
        this.slotID = 0;
        this.location = "";
        this.date = LocalDate.now();
        this.startTime = LocalTime.of(0,0);
        this.endTime = LocalTime.of(0,0);
        this.bloodType = "";
    }

    //Parameterized Constructor
    public AppointmentSlot(int slotID, String location, LocalDate date, LocalTime startTime, LocalTime endTime, String bloodType){
            this.slotID = slotID;
            this.location = location;
            this.date = date;
            this.startTime = startTime;
            this.endTime = endTime;
            this.bloodType = bloodType;
    }

    // Getters
    public int getSlotID() {
        return slotID;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getBloodType() {
        return bloodType;
    }

    // Setters
    public void setSlotID(int slotID) {
        this.slotID = slotID;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
