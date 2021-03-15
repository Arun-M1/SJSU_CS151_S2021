/**
 * Custom Exception class
 * 
 * @author Arun Murugan
 * Version 1.0
 * @since 2021-3-15
 */
public class TooManyHoursWorkedException extends Exception {

    /**
     * Throws exception if number of hours is greater than 40
     * @param message
     */
    public TooManyHoursWorkedException(String message) {
        super(message);
    }
}
