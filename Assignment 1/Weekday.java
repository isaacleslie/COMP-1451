 

import java.util.HashMap;
import java.util.Map;

/**
 * The seven names given to 24-hour periods in the Gregorian Calendar.
 * 
 * @author James Pede
 * @version Jul12'14,1600h
 */
public enum Weekday
{
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");
    
    private String literal;

    private static Map<String, Weekday> lookup = new HashMap<String, Weekday>();
      
    static{
        for (Weekday w : Weekday.values()){
            lookup.put(w.toString(), w);
        }
    } // end class init

    /**
     * Weekday Constructor
     *
     * @param literal A parameter
     */
    private Weekday(String literal) {
        this.literal = literal;
    } // end constructor

    /**
     * Method get
     *
     * @param searchTerm A parameter
     * @return The return value
     */
    public static Weekday get(String searchTerm) {
        return lookup.get(searchTerm);
    } // end class method

    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString() {
        return literal;
    } // end accessor
} // end class
