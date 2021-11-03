/*
 * This is our InvalidDonationSchedulingException class which gives us customized exception messages for our app.
 */

package com.keyin.manager;

// Extend the default Exception class
public class InvalidDonationSchedulingException extends Exception {
    // Default constructor inherits the parent class (Exception) constructor
    public InvalidDonationSchedulingException() {
        super();
    }
    // Parameterized constructor to add our custom exception message
    public InvalidDonationSchedulingException(String message){
        super(message);
    }
}
