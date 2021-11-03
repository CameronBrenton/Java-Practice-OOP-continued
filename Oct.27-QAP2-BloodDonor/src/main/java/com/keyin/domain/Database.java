/*
 * This is the Database class
 */
package com.keyin.domain;

// imports
import com.keyin.domain.appointment.AppointmentSlot;
import com.keyin.donor.BloodDonor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Database extends AppointmentSlot {
    private BloodDonor bloodDonor;



    // Getters
    // Returns a mock hardcoded database of AppointmentSlot objects in an ArrayList data type
    public List<AppointmentSlot> getAppointmentSlots() {
        ArrayList<AppointmentSlot> appointmentSlots = new ArrayList<AppointmentSlot>();

        // Create the mock database objects
        AppointmentSlot appointmentSlot = new AppointmentSlot();
        appointmentSlot.setSlotID(1);
        appointmentSlot.setLocation("123 Water St. St. John's NL");
        appointmentSlot.setDate(LocalDate.of(12,12,12));

        AppointmentSlot appointmentSlot2 = new AppointmentSlot();
        appointmentSlot2.setSlotID(2);
        appointmentSlot2.setLocation("321 Blueberry St. St. John's NL");
        appointmentSlot2.setDate(LocalDate.of(12,12,12));

        AppointmentSlot appointmentSlot3 = new AppointmentSlot();
        appointmentSlot3.setSlotID(3);
        appointmentSlot3.setLocation("444 Tur St. St. John's NL");
        appointmentSlot3.setDate(LocalDate.of(12,12,12));

        AppointmentSlot appointmentSlot4 = new AppointmentSlot(4, "123 Water St. St. John's NL", LocalDate.now(), LocalTime.of(10, 15), LocalTime.of(10, 45), "A+");
        appointmentSlot4.setDate(LocalDate.of(12,12,12));

        // Add the Appointment slot objects to the appointment array list
        appointmentSlots.add(appointmentSlot);
        appointmentSlots.add(appointmentSlot2);
        appointmentSlots.add(appointmentSlot3);
        appointmentSlots.add(appointmentSlot4);

        return appointmentSlots;
    }

    // Create and return a new Donor
    public BloodDonor getDonor(int id) {
        // Create new BloodDonor mock object
        //int donorID, String firstName, String lastName, LocalDate dateOfBirth, String bloodType, LocalDate nextAppointment, LocalDate lastDonationDate
        if(id == 1){
            bloodDonor = new BloodDonor(1, "Tony", "Soprano", LocalDate.now(), "B", LocalDate.now(), LocalDate.now());
            bloodDonor.setDateOfBirth(LocalDate.of( 1980 , Month.FEBRUARY , 11 ));
            bloodDonor.setNextAppointment(LocalDate.of(2021,12,12));
            bloodDonor.setLastDonationDate(LocalDate.of(2015, 6, 6));
            return bloodDonor;
        }else if(id == 2){
            bloodDonor = new BloodDonor(2, "Franklin", "Templeton", LocalDate.now(), "O", LocalDate.of(2021,12,12), LocalDate.of(2021, 6, 6));
            bloodDonor.setDateOfBirth(LocalDate.of( 1989 , Month.JANUARY , 19 ));
            return bloodDonor;
        }else if(id == 3){
            bloodDonor = new BloodDonor(3, "Joe", "West", LocalDate.now(), "B", null , LocalDate.of(2021, 6, 6));
            bloodDonor.setDateOfBirth(LocalDate.of( 1990 , Month.JUNE , 23 ));
            return bloodDonor;
        }else if(id == 4){
            bloodDonor = new BloodDonor(4, "Trish", "Maplewood", LocalDate.now(), "O", null , LocalDate.of(2021, 6, 6));
            bloodDonor.setDateOfBirth(LocalDate.of( 1999 , Month.DECEMBER , 25 ));
            return bloodDonor;
        }else if(id == 5){
            bloodDonor = new BloodDonor(5, "Alice", "Wappinger", LocalDate.now(), "A+", LocalDate.of(2021,12,12), null);
            bloodDonor.setDateOfBirth(LocalDate.of( 1960 , Month.OCTOBER , 1 ));
            return bloodDonor;
        }else if(id == 6){
            bloodDonor = new BloodDonor(6, "Terence", "O'Neal", LocalDate.now(), "A+", null, LocalDate.of(2020, 5, 14));
            bloodDonor.setDateOfBirth(LocalDate.of( 1970 , Month.JULY , 29 ));
            return bloodDonor;
        }else if(id == 7){
            bloodDonor = new BloodDonor(7, "Marty", "Northhouse", LocalDate.now(), "O", null, null);
            bloodDonor.setDateOfBirth(LocalDate.of( 1975 , Month.SEPTEMBER , 30 ));
            return bloodDonor;
        }else if(id == 8){
            bloodDonor = new BloodDonor(8, "Mike", "Belair", LocalDate.now(), "AB", null, null);
            bloodDonor.setDateOfBirth(LocalDate.of( 1998 , Month.NOVEMBER , 2 ));
            return bloodDonor;
        }else if(id == 9){
            bloodDonor = new BloodDonor(9, "Ashley", "Ryan", LocalDate.now(), "AB", null, LocalDate.of(2018, 7, 30));
            bloodDonor.setDateOfBirth(LocalDate.of( 1995 , Month.NOVEMBER , 15 ));
            return bloodDonor;
        }else{
            bloodDonor = new BloodDonor(id, "Phil", "Donahue", LocalDate.now(), "A+", null, null);
            bloodDonor.setDateOfBirth(LocalDate.of( 1970 , Month.MARCH , 22 ));
            return bloodDonor;
        }



    }


}
