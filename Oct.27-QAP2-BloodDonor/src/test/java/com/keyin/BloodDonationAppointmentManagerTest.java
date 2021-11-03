/*
 * This is the BloodDonationAppointmentManager test class
 */
package com.keyin;

// imports
import com.keyin.domain.Database;
import com.keyin.domain.appointment.BloodDonationAppointment;
import com.keyin.donor.BloodDonor;
import com.keyin.manager.BloodDonationAppointmentManager;
import com.keyin.manager.InvalidDonationSchedulingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.Month;

@ExtendWith(MockitoExtension.class)
public class BloodDonationAppointmentManagerTest {
    @Mock
    private Database mockDatabase;

    // Test if the donation date is valid

    // Test if the Donor is too young
    @Test
    public void testDonorTooYoung(){
        BloodDonor bloodDonor = new BloodDonor(1, "Merideth>", "Macbeth", LocalDate.now(), "B", LocalDate.now(), LocalDate.now());
        bloodDonor.setDateOfBirth(LocalDate.of( 2009 , Month.FEBRUARY , 11 ));
        bloodDonor.setNextAppointment(LocalDate.of(2021,12,12));
        bloodDonor.setLastDonationDate(LocalDate.of(2015, 6, 6));


        // When there is a call for get Donor with id:1, then return the bloodDonor object we created
        Mockito.when(mockDatabase.getDonor(1)).thenReturn(
                bloodDonor
        );

        BloodDonationAppointmentManager bloodDonationAppointmentManager = new BloodDonationAppointmentManager(mockDatabase);

        try {
            BloodDonationAppointment bloodDonationAppointment = bloodDonationAppointmentManager.bookAppointment(1);
        } catch (InvalidDonationSchedulingException e) {
            Assertions.assertTrue(e.getMessage().equalsIgnoreCase("Sorry, the donor must be at least 18 years old"));
        }

    }

    // Test if the Donor is too Old
    @Test
    public void testDonorTooOld(){
        BloodDonor bloodDonor = new BloodDonor(1, "Gandalf", "TheGrey", LocalDate.now(), "B", LocalDate.now(), LocalDate.now());
        bloodDonor.setDateOfBirth(LocalDate.of( 750 , Month.FEBRUARY , 11 ));
        bloodDonor.setNextAppointment(LocalDate.of(2021,12,12));
        bloodDonor.setLastDonationDate(LocalDate.of(2015, 6, 6));


        // When there is a call for get Donor with id:1, then return the bloodDonor object we created
        Mockito.when(mockDatabase.getDonor(1)).thenReturn(
                bloodDonor
        );

        BloodDonationAppointmentManager bloodDonationAppointmentManager = new BloodDonationAppointmentManager(mockDatabase);

        try {
            BloodDonationAppointment bloodDonationAppointment = bloodDonationAppointmentManager.bookAppointment(1);
        } catch (InvalidDonationSchedulingException e) {
            Assertions.assertTrue(e.getMessage().equalsIgnoreCase("Sorry, the donor can not be over 80 years old"));
        }

    }


    // Test for invalid donor blood type
    @Test
    public void testDonorInvalidBloodType(){
        BloodDonor bloodDonor = new BloodDonor(1, "Tony", "Soprano", LocalDate.now(), "Z", LocalDate.now(), LocalDate.now());
        bloodDonor.setDateOfBirth(LocalDate.of( 1980 , Month.FEBRUARY , 11 ));
        bloodDonor.setNextAppointment(LocalDate.of(2021,12,12));
        bloodDonor.setLastDonationDate(LocalDate.of(2015, 6, 6));


        // When there is a call for get Donor with id:1, then return the bloodDonor object we created
        Mockito.when(mockDatabase.getDonor(1)).thenReturn(
                bloodDonor
        );

        BloodDonationAppointmentManager bloodDonationAppointmentManager = new BloodDonationAppointmentManager(mockDatabase);

        try {
            BloodDonationAppointment bloodDonationAppointment = bloodDonationAppointmentManager.bookAppointment(1);
        } catch (InvalidDonationSchedulingException e) {
            Assertions.assertTrue(e.getMessage().equalsIgnoreCase("Sorry, the donor blood type must be be the same as the appointment blood type"));
        }

    }

    // Test for an invalid donation date too soon in the future
    @Test
    public void testInvalidDonationDateTooSoon(){
        BloodDonor bloodDonor = new BloodDonor(1, "Loraine", "Scully", LocalDate.now(), "A", LocalDate.now(), LocalDate.now());
        bloodDonor.setDateOfBirth(LocalDate.of( 1980 , Month.FEBRUARY , 11 ));
        bloodDonor.setNextAppointment(LocalDate.of(2021,12,12));
        bloodDonor.setLastDonationDate(LocalDate.of(2021, 11, 6));


        // When there is a call for get Donor with id:1, then return the bloodDonor object we created
        Mockito.when(mockDatabase.getDonor(1)).thenReturn(
                bloodDonor
        );

        BloodDonationAppointmentManager bloodDonationAppointmentManager = new BloodDonationAppointmentManager(mockDatabase);

        try {
            BloodDonationAppointment bloodDonationAppointment = bloodDonationAppointmentManager.bookAppointment(1);
        } catch (InvalidDonationSchedulingException e) {
            Assertions.assertTrue(e.getMessage().equalsIgnoreCase("Sorry, you must wait 56 days between appointments"));
        }

    }

    // Test for an invalid donation date too far in the future
    @Test
    public void testInvalidDonationDateTooFar(){
        BloodDonor bloodDonor = new BloodDonor(1, "Tedros", "Peké", LocalDate.now(), "A", LocalDate.now(), LocalDate.now());
        bloodDonor.setDateOfBirth(LocalDate.of( 1980 , Month.FEBRUARY , 11 ));
        bloodDonor.setNextAppointment(LocalDate.of(2022,12,12));
        bloodDonor.setLastDonationDate(LocalDate.of(2015, 6, 6));


        // When there is a call for get Donor with id:1, then return the bloodDonor object we created
        Mockito.when(mockDatabase.getDonor(1)).thenReturn(
                bloodDonor
        );

        BloodDonationAppointmentManager bloodDonationAppointmentManager = new BloodDonationAppointmentManager(mockDatabase);

        try {
            BloodDonationAppointment bloodDonationAppointment = bloodDonationAppointmentManager.bookAppointment(1);
        } catch (InvalidDonationSchedulingException e) {
            Assertions.assertTrue(e.getMessage().equalsIgnoreCase("Sorry, you can not schedule appointments over 1 year from the last appointment"));
        }

    }

    // Test for an attempt to schedule an appointment when the donor already has one.
    @Test
    public void testAttemptedDuplicateAppointment(){
        BloodDonor bloodDonor = new BloodDonor(1, "Miles", "Geordano", LocalDate.now(), "A", LocalDate.now(), LocalDate.now());
        bloodDonor.setDateOfBirth(LocalDate.of( 1980 , Month.FEBRUARY , 11 ));
        bloodDonor.setNextAppointment(LocalDate.of(2021,12,12));
        bloodDonor.setLastDonationDate(LocalDate.of(2021, 12, 12));


        // When there is a call for get Donor with id:1, then return the bloodDonor object we created
        Mockito.when(mockDatabase.getDonor(1)).thenReturn(
                bloodDonor
        );

        BloodDonationAppointmentManager bloodDonationAppointmentManager = new BloodDonationAppointmentManager(mockDatabase);

        try {
            BloodDonationAppointment bloodDonationAppointment = bloodDonationAppointmentManager.bookAppointment(1);
        } catch (InvalidDonationSchedulingException e) {
            Assertions.assertTrue(e.getMessage().equalsIgnoreCase("Sorry, you can't schedule an appointment when you already has one for that date"));
        }

    }

}
