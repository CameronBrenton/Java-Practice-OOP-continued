/*
 * This is the BloodDonationAppointmentManager class.
 * This is the class under test
 */
package com.keyin.manager;

// imports
import com.keyin.domain.Database;
import com.keyin.domain.appointment.AppointmentSlot;
import com.keyin.domain.appointment.BloodDonationAppointment;
import com.keyin.donor.BloodDonor;

import java.time.LocalDate;
import java.util.List;
import java.time.Period;

public class BloodDonationAppointmentManager {
    // Instance variables
    private BloodDonor bloodDonor;
    private Database database;
    private List<AppointmentSlot> appointmentSlotList;
    private BloodDonationAppointment bloodDonationAppointment;



    // Parameterized constructor connecting the database to the BloodDonationAppointmentManager
    public BloodDonationAppointmentManager(Database database){
        this.database = database;
    }


    // Book an appointment method
    public BloodDonationAppointment bookAppointment(int donorID) throws InvalidDonationSchedulingException{

        bloodDonor = database.getDonor(donorID);
        appointmentSlotList = database.getAppointmentSlots();

        LocalDate donorDateOfBirth = bloodDonor.getDateOfBirth();
        LocalDate lastDonorAppointmentDate = bloodDonor.getLastDonationDate();

        // Initiate a BloodDonationAppointmentObject
        bloodDonationAppointment = new BloodDonationAppointment();


        // Increment through the ArrayList and check the business rules against the donor
        for (int i=0; i<appointmentSlotList.size(); i++){
            AppointmentSlot appointmentSlot = appointmentSlotList.get(i);

            // Check to make sure the donor is at least 18 years old at the time of appointment
            Period period = Period.between(donorDateOfBirth, appointmentSlot.getAppointmentDate());
            try{
                if(period.getYears() >= 18){
                    // Set the date of birth on the appointment slot object
                    appointmentSlot.setDateOfBirth(donorDateOfBirth);
                }else{
                    System.out.println("Sorry, the donor must be at least 18 years old");
                    throw new InvalidDonationSchedulingException("Sorry, the donor must be at least 18 years old");
                }
            }catch(InvalidDonationSchedulingException e){
                throw new InvalidDonationSchedulingException("Sorry, the donor must be at least 18 years old");
            }
            // Check to make sure the donor is not over 80 years old at the time of appointment
            try{
                if(period.getYears() <= 80){

                }else {
                    System.out.println("Sorry, the donor can not be over 80 years old");
                    throw new InvalidDonationSchedulingException("Sorry, the donor can not be over 80 years old");
                }
            }catch(InvalidDonationSchedulingException e){
                throw new InvalidDonationSchedulingException("Sorry, the donor can not be over 80 years old");
            }
            // Check to make sure the donor is at least 56 days between appointments
            Period period2 = Period.between(lastDonorAppointmentDate, appointmentSlot.getAppointmentDate());
            try{
                if(period2.getDays() >= 56){
                }else{
                    System.out.println("Sorry, you must wait 56 days between appointments");
                    throw new InvalidDonationSchedulingException("Sorry, you must wait 56 days between appointments");
                }
            } catch(InvalidDonationSchedulingException e){
                throw new InvalidDonationSchedulingException("Sorry, you must wait 56 days between appointments");
            }
            // Check to make sure the appointment date is not more than 1 year from the last appointment date
            try{
                if(period2.getDays() <= 365){
                }else{
                    System.out.println("Sorry, you can not schedule appointments over 1 year from the last appointment");
                    throw new InvalidDonationSchedulingException("Sorry, you can not schedule appointments over 1 year from the last appointment");
                }
            } catch(InvalidDonationSchedulingException e){
                throw new InvalidDonationSchedulingException("Sorry, you can not schedule appointments over 1 year from the last appointment");
            }
            // Check to make sure the Appointment blood type matches the donor blood type
            try{
                if(bloodDonor.getBloodType() == appointmentSlot.getBloodType()){
                }else{
                    System.out.println("Sorry, the donor blood type must be be the same as the appointment blood type");
                    throw new InvalidDonationSchedulingException("Sorry, the donor blood type must be be the same as the appointment blood type");
                }
            } catch(InvalidDonationSchedulingException e){
                throw new InvalidDonationSchedulingException("Sorry, the donor blood type must be be the same as the appointment blood type");
            }
            // Check to see if the donor is a first timer. If true, then the appointment will indicate this.
            try{
                if(bloodDonor.getLastDonationDate() != null){
                    bloodDonationAppointment.setFistTimeDonor(true);
                }else{
                    System.out.println("Notice: This is a first time donor");
                }
            } catch(Exception e){
                throw new InvalidDonationSchedulingException("Invalid Donation Scheduling Exception");
            }
        }
        // Return the newly created blood donation appointment
        return bloodDonationAppointment;
    }

}
