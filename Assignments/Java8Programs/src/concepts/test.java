package concepts;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class test {
	 public static Instant getDateFromString(String string)
	    {
	        // Creating an instant object
	        Instant timestamp = null;
	 
	        // Parsing the string to Date
	        timestamp = Instant.parse(string);
	 
	        // Returning the converted timestamp
	        return timestamp;
	    }

	public static void main(String[] args) throws Exception
    {
 
		 String string = "2018-10-28";
		 
	        // Try block to check for exceptions
	        try {
	 
	            // Getting the Date from String by
	            // creating object of Instant class
	            Instant timestamp = getDateFromString(string);
	 
	            // Printing the converted date
	            System.out.println(timestamp);
	        }
	 
	        // Catch block to handle exceptions
	        catch (DateTimeParseException e) {
	        	// Throws DateTimeParseException
	            // if the string cannot be parsed
	            System.out.println("Exception: " + e);
	        }
	        }
    }

